package jp.crwdev.app.container.pdf;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;

import jp.crwdev.app.BufferedImageIO;
import jp.crwdev.app.util.InifileProperty;

public class GhostscriptUtil {

	private static GhostscriptUtil mInstance;
	
	private static String mGSC = "C:\\Program Files\\gs\\gs9.10\\bin\\gswin32c.exe";
	private static String mTmpImageHead = "";
	private static String mTmpImageName = "_%05d.jpg";
	private static String mTmpFolder = "tmp\\";

	private static String mPdfFilePath;
	
	private static int mPageCount = 0;
	
	public interface GhostscriptUtilEventListener {
		void onComplete(int page, BufferedImage image);
	}
	
	static public GhostscriptUtil getInstance(){
		if(mInstance == null){
			mInstance = new GhostscriptUtil();
			mInstance.setGSC(InifileProperty.getInstance().getGhostScriptPath());
		}
		return mInstance;
	}
	
	protected GhostscriptUtil(){
		
	}
	public void setGSC(String gsc){
		mGSC = gsc;
	}
	
	public boolean isEnable(){
		File file = new File(mGSC);
		return file.exists();
	}
	
	public int getNumOfPages(){
		return mPageCount;
	}
	
	public boolean open(String path, int pageCount){
		mPdfFilePath = path;
		try {
			File file = new File(path);
			String name = file.getName();
			mTmpImageHead = name.substring(0, name.length() - 4);
			
			File dir = new File(mTmpFolder);
			if(!dir.exists()){
				dir.mkdirs();
			}
			mPageCount = pageCount;
			if(pageCount <= 0){
				PdfReader pdfReader = new PdfReader(path);
				mPageCount = pdfReader.getNumberOfPages();
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void close(){
		if(mPdfFilePath != null){
			mPdfFilePath = null;
			File dir = new File(mTmpFolder);
			if(dir.exists()){
				if(!dir.delete()){
					dir.deleteOnExit();
				}
			}
		}
	}
	
	
	public void getPageAsImage(int page, GhostscriptUtilEventListener event){
		final int fPage = page;
		final GhostscriptUtilEventListener fEvent = event;
		new Thread(){
			public void run(){
				BufferedImage image = getPageAsImage(fPage);
				if(fEvent != null){
					fEvent.onComplete(fPage, image);
				}
			}
		}.start();
	}
	public BufferedImage getPageAsImage(int page){
		File file = getPageAsFile(page);
		if(file != null){
			FileInputStream in = null;
			try {
				in = new FileInputStream(file);
				return BufferedImageIO.read(in, true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				if(in != null){
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}
	
	public File getPageAsFile(int page){
		if(page < 1 || mPageCount < page){
			return null;
		}
		
		
		String imageName = String.format(mTmpImageHead + mTmpImageName, page);
		File file = new File(mTmpFolder + imageName);
		if(file.exists()){
			return file;
		}
		else{
			Runtime r = Runtime.getRuntime();
			String command = mGSC + " -dSAFER -dBATCH -dFirstPage=" + page + " -dLastPage=" + page + " -dNOPAUSE -sDEVICE=jpeg -dJPEGQ=100 -dQFactor=1.0 -r178 ";
			command += "-sOutputFile=\"" + mTmpFolder + imageName + "\" ";
			command += "\"" + mPdfFilePath + "\"";
			int result = 0;
			try {
				Process p = r.exec(command);
				result = p.waitFor();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(result == 0){
				if(file.exists()){
					return file;
				}
			}
			return null;
		}
	}
}