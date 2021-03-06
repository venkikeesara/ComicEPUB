﻿package jp.crwdev.app.imagefilter;

import java.awt.Dimension;

import jp.crwdev.app.constant.Constant;

public class ImageFilterParam implements Cloneable {



	public ImageFilterParam(ImageFilterParam base){
		copyParams(base, this);
	}


	public ImageFilterParam(){
		mIsEnable = false;
		mIsPreview = false;
		mIsDrawCropAreaInPreview = true;
		mIsColorPageAutoCrop = false;
		mIsPictPageAutoCrop = false;
		mIsTextPageAutoCrop = false;
		mIsFullPageAutoCrop = false;
		mIsColorPageCrop = false;
		mColorPageCropLeft = 0;
		mColorPageCropTop = 0;
		mColorPageCropRight = 0;
		mColorPageCropBottom = 0;
		mIsTextPageCrop = false;
		mTextPageCropLeft = 0;
		mTextPageCropTop = 0;
		mTextPageCropRight = 0;
		mTextPageCropBottom = 0;
		mIsPictPageCrop = false;
		mPictPageCropLeft = 0;
		mPictPageCropTop = 0;
		mPictPageCropRight = 0;
		mPictPageCropBottom = 0;
		mIsResize = false;
		mResizeDimension = new Dimension(0, 0);
		mFixedSize = new Dimension(0, 0);
		mIsGrayscale = false;
		mIsGamma = false;
		mGamma = 1.0f;
		mIsContrast = false;
		mContrast = 1.0f;
		mBrightness = 0;
		mIsBlur = false;
		mBlurPixels = 3;
		mIsSharpness = false;
		mSharpnessPixels = 3;
		mIsEqualize = false;
		mIsFullPageCrop = false;
		mFullPageCropLeft = 0;
		mFullPageCropTop = 0;
		mFullPageCropRight = 0;
		mFullPageCropBottom = 0;
		mIsTranslate = false;
		mIsRotate = false;
		mTranslateX = 0;
		mTranslateY = 0;
		mRotateAngle = 0.0f;
		mSplitType = SplitFilter.TYPE_NONE;
		mSplitIndex = 0;
		mPageSpread = Constant.PAGESPREAD_AUTO;
		mColorPageAutoCropThreshold = 0;
		mTextPageAutoCropThreshold = 0;
		mPictPageAutoCropThreshold = 0;
		mFullPageAutoCropThreshold = 0;

		mPageType = Constant.PAGETYPE_AUTO;
		mConvertPageType = Constant.PAGETYPE_AUTO;
	}

	@Override
	public ImageFilterParam clone(){
		ImageFilterParam p;
		try {
			p = (ImageFilterParam)super.clone();
		} catch (CloneNotSupportedException ce){
			throw new RuntimeException();
		}
		copyParams(this, p);
	    return p;
	}



	private void copyParams(ImageFilterParam src, ImageFilterParam dest){
		dest.mIsEnable = src.isEnable();
		dest.mIsPreview = src.isPreview();
		dest.mIsDrawCropAreaInPreview = src.isDrawCropAreaInPreview();
		dest.mIsColorPageAutoCrop = src.isColorPageAutoCrop();
		dest.mIsPictPageAutoCrop = src.isPictPageAutoCrop();
		dest.mIsTextPageAutoCrop = src.isTextPageAutoCrop();
		dest.mIsFullPageAutoCrop = src.isFullPageAutoCrop();
		dest.mIsColorPageCrop = src.isColorPageCrop();
		dest.mColorPageCropLeft = src.getColorPageCropLeft();
		dest.mColorPageCropTop = src.getColorPageCropTop();
		dest.mColorPageCropRight = src.getColorPageCropRight();
		dest.mColorPageCropBottom = src.getColorPageCropBottom();
		dest.mIsTextPageCrop = src.isTextPageCrop();
		dest.mTextPageCropLeft = src.getTextPageCropLeft();
		dest.mTextPageCropTop = src.getTextPageCropTop();
		dest.mTextPageCropRight = src.getTextPageCropRight();
		dest.mTextPageCropBottom = src.getTextPageCropBottom();
		dest.mIsPictPageCrop = src.isPictPageCrop();
		dest.mPictPageCropLeft = src.getPictPageCropLeft();
		dest.mPictPageCropTop = src.getPictPageCropTop();
		dest.mPictPageCropRight = src.getPictPageCropRight();
		dest.mPictPageCropBottom = src.getPictPageCropBottom();
		dest.mColorPageAutoCropThreshold = src.getColorPageAutoCropThreshold();
		dest.mTextPageAutoCropThreshold = src.getTextPageAutoCropThreshold();
		dest.mPictPageAutoCropThreshold = src.getPictPageAutoCropThreshold();
		dest.mFullPageAutoCropThreshold = src.getFullPageAutoCropThreshold();
		dest.mIsResize = src.isResize();
		dest.mResizeDimension = src.getResizeDimension();
		dest.mFixedSize = src.getFixedSize();
		dest.mIsGrayscale = src.isGrayscale();
		dest.mIsGamma = src.isGamma();
		dest.mGamma = src.getGamma();
		dest.mIsBlur = src.isBlur();
		dest.mBlurPixels = src.getBlurPixels();
		dest.mIsSharpness = src.isSharpness();
		dest.mSharpnessPixels = src.getSharpnessPixels();
		dest.mIsContrast = src.isContrast();
		dest.mContrast = src.getContrast();
		dest.mBrightness = src.getBrightness();
		dest.mIsEqualize = src.isEqualize();
		dest.mIsFullPageCrop = src.isFullPageCrop();
		dest.mFullPageCropLeft = src.getFullPageCropLeft();
		dest.mFullPageCropTop = src.getFullPageCropTop();
		dest.mFullPageCropRight = src.getFullPageCropRight();
		dest.mFullPageCropBottom = src.getFullPageCropBottom();
		dest.mIsTranslate = src.isTranslate();
		dest.mIsRotate = src.isRotate();
		dest.mTranslateX = src.getTranslateX();
		dest.mTranslateY = src.getTranslateY();
		dest.mRotateAngle = src.getRotateAngle();
		dest.mSplitType = src.getSplitType();
		dest.mSplitIndex = src.getSplitIndex();
		dest.mPageSpread = src.getPageSpread();
	}

	protected boolean mIsEnable;
	protected boolean mIsPreview;
	protected boolean mIsDrawCropAreaInPreview;
	protected boolean mIsColorPageAutoCrop;
	protected boolean mIsPictPageAutoCrop;
	protected boolean mIsTextPageAutoCrop;
	protected boolean mIsFullPageAutoCrop;
	protected boolean mIsColorPageCrop;
	protected int mColorPageCropLeft;
	protected int mColorPageCropTop;
	protected int mColorPageCropRight;
	protected int mColorPageCropBottom;
	protected boolean mIsTextPageCrop;
	protected int mTextPageCropLeft;
	protected int mTextPageCropTop;
	protected int mTextPageCropRight;
	protected int mTextPageCropBottom;
	protected boolean mIsPictPageCrop;
	protected int mPictPageCropLeft;
	protected int mPictPageCropTop;
	protected int mPictPageCropRight;
	protected int mPictPageCropBottom;
	protected boolean mIsResize;
	protected Dimension mResizeDimension = new Dimension();
	protected Dimension mFixedSize = new Dimension();
	protected boolean mIsGrayscale;
	protected boolean mIsGamma;
	protected double mGamma;
	protected boolean mIsBlur;
	protected float mBlurPixels;
	protected boolean mIsSharpness;
	protected float mSharpnessPixels;
	protected boolean mIsContrast;
	protected float mContrast;
	protected float mBrightness;
	protected boolean mIsEqualize;
	protected boolean mIsFullPageCrop;
	protected int mFullPageCropLeft;
	protected int mFullPageCropTop;
	protected int mFullPageCropRight;
	protected int mFullPageCropBottom;
	protected int mColorPageAutoCropThreshold;
	protected int mTextPageAutoCropThreshold;
	protected int mPictPageAutoCropThreshold;
	protected int mFullPageAutoCropThreshold;
	protected boolean mIsTranslate;
	protected int mTranslateX;
	protected int mTranslateY;
	protected boolean mIsRotate;
	protected double mRotateAngle;
	protected int mSplitType;
	protected int mSplitIndex;
	protected float[] mSplitOffsetV;
	protected float[] mSplitOffsetH;
	protected String mPageSpread;

	protected boolean mIsUnificationTextPage = false;
	//protected static Dimension mUnificationTextPageSize = new Dimension(0, 0);

	// Dynamic
	protected int mPageType;
	protected int mConvertPageType;



	public boolean isEnable() {
		return mIsEnable;
	}

	/**
	 * 編集操作(Crop枠など)のプレビュー状態を返す。(設定パネルのプレビューモードとは逆の値)
	 * @return
	 */
	public boolean isPreview() {
		return mIsPreview;
	}

	public boolean isDrawCropAreaInPreview(){
		return mIsDrawCropAreaInPreview;
	}

	public boolean isColorPageAutoCrop() {
		return mIsColorPageAutoCrop;
	}

	public boolean isPictPageAutoCrop() {
		return mIsPictPageAutoCrop;
	}

	public boolean isTextPageAutoCrop() {
		return mIsTextPageAutoCrop;
	}

	public boolean isFullPageAutoCrop() {
		return mIsFullPageAutoCrop;
	}

	public int getColorPageAutoCropThreshold() {
		return mColorPageAutoCropThreshold;
	}

	public int getPictPageAutoCropThreshold() {
		return mPictPageAutoCropThreshold;
	}

	public int getTextPageAutoCropThreshold() {
		return mTextPageAutoCropThreshold;
	}

	public int getFullPageAutoCropThreshold() {
		return mFullPageAutoCropThreshold;
	}

	public boolean isColorPageCrop() {
		return mIsColorPageCrop;
	}

	public int getColorPageCropLeft() {
		return mColorPageCropLeft;
	}

	public int getColorPageCropTop() {
		return mColorPageCropTop;
	}

	public int getColorPageCropRight() {
		return mColorPageCropRight;
	}

	public int getColorPageCropBottom() {
		return mColorPageCropBottom;
	}

	public boolean isTextPageCrop() {
		return mIsTextPageCrop;
	}

	public int getTextPageCropLeft() {
		return mTextPageCropLeft;
	}

	public int getTextPageCropTop() {
		return mTextPageCropTop;
	}

	public int getTextPageCropRight() {
		return mTextPageCropRight;
	}

	public int getTextPageCropBottom() {
		return mTextPageCropBottom;
	}

	public boolean isPictPageCrop() {
		return mIsPictPageCrop;
	}

	public int getPictPageCropLeft() {
		return mPictPageCropLeft;
	}

	public int getPictPageCropTop() {
		return mPictPageCropTop;
	}

	public int getPictPageCropRight() {
		return mPictPageCropRight;
	}

	public int getPictPageCropBottom() {
		return mPictPageCropBottom;
	}

	public boolean isResize() {
		return mIsResize;
	}

	public Dimension getResizeDimension() {
		return mResizeDimension;
	}

	public Dimension getFixedSize() {
		return mFixedSize;
	}

	public boolean isGrayscale() {
		return mIsGrayscale;
	}

	public boolean isGamma() {
		return mIsGamma;
	}

	public double getGamma() {
		return mGamma;
	}

	public boolean isBlur() {
		return mIsBlur;
	}

	public float getBlurPixels() {
		return mBlurPixels;
	}

	public boolean isSharpness() {
		return mIsSharpness;
	}

	public float getSharpnessPixels() {
		return mSharpnessPixels;
	}

	public boolean isContrast() {
		return mIsContrast;
	}

	public float getContrast() {
		return mContrast;
	}

	public float getBrightness() {
		return mBrightness;
	}

	public boolean isEqualize() {
		return mIsEqualize;
	}

	public boolean isFullPageCrop() {
		return mIsFullPageCrop;
	}

	public int getFullPageCropLeft() {
		return mFullPageCropLeft;
	}

	public int getFullPageCropTop() {
		return mFullPageCropTop;
	}

	public int getFullPageCropRight() {
		return mFullPageCropRight;
	}

	public int getFullPageCropBottom() {
		return mFullPageCropBottom;
	}

	public boolean isRotate() {
		return mIsRotate;
	}

	public double getRotateAngle() {
		return mRotateAngle;
	}

	public boolean isTranslate() {
		return mIsTranslate;
	}

	public int getTranslateX() {
		return mTranslateX;
	}

	public int getTranslateY() {
		return mTranslateY;
	}

	public int getSplitType() {
		return mSplitType;
	}

	public int getSplitIndex() {
		return mSplitIndex;
	}

	public String getPageSpread(){
		return mPageSpread;
	}

	public boolean isUnificationTextPage() {
		return mIsUnificationTextPage;
	}

	//public static Dimension getUnificationTextPageSize() {
	//	return mUnificationTextPageSize;
	//}


	// Dynamic

	public int getPageType() {
		return mPageType;
	}

	public void setPageType(int pageType) {
		mPageType = pageType;
	}

	public void setRotate(boolean enable){
		mIsRotate = enable;
	}

	public void setRotateAngle(double angle){
		mRotateAngle = angle;
	}

	public int getConvertPageType() {
		return mConvertPageType;
	}

	public void setConvertPageType(int pageType) {
		mConvertPageType = pageType;
	}

	public void setBrightness(float offset) {
		mBrightness = offset;
	}

	public void setContrast(boolean enable) {
		mIsContrast = enable;
	}

	public void setContrast(float scale) {
		mContrast = scale;
	}

	public void setBlur(boolean enable) {
		mIsBlur = enable;
	}

	public void setBlurPixels(float pixels){
		mBlurPixels = pixels;
	}

	public void setSharpness(boolean enable) {
		mIsSharpness = enable;
	}

	public void setSharpnessPixels(float pixels){
		mSharpnessPixels = pixels;
	}

	public void setDrawCropAreaInPreview(boolean enable) {
		mIsDrawCropAreaInPreview = enable;
	}

	public void setEnable(boolean enable) {
		mIsEnable = enable;
	}

	public void setEqualize(boolean enable) {
		mIsEqualize = enable;
	}

	public void setColorPageAutoCrop(boolean enable) {
		mIsColorPageAutoCrop = enable;
	}

	public void setPictPageAutoCrop(boolean enable) {
		mIsPictPageAutoCrop = enable;
	}

	public void setTextPageAutoCrop(boolean enable) {
		mIsTextPageAutoCrop = enable;
	}

	public void setFullPageAutoCrop(boolean enable) {
		mIsFullPageAutoCrop = enable;
	}

	public void setColorPageAutoCropThreshold(int cropThreshold) {
		mColorPageAutoCropThreshold = cropThreshold;
	}

	public void setPictPageAutoCropThreshold(int cropThreshold) {
		mPictPageAutoCropThreshold = cropThreshold;
	}

	public void setTextPageAutoCropThreshold(int cropThreshold) {
		mTextPageAutoCropThreshold = cropThreshold;
	}

	public void setFullPageAutoCropThreshold(int cropThreshold) {
		mFullPageAutoCropThreshold = cropThreshold;
	}

	public void setFullPageCrop(boolean enable) {
		mIsFullPageCrop = enable;
	}

	public void setFullPageCropBottom(int bottom) {
		mFullPageCropBottom = bottom;
	}

	public void setFullPageCropLeft(int left) {
		mFullPageCropLeft = left;
	}

	public void setFullPageCropRight(int right) {
		mFullPageCropRight = right;
	}

	public void setFullPageCropTop(int top) {
		mFullPageCropTop = top;
	}

	public void setFullPageCrop(int left, int top, int right, int bottom) {
		mFullPageCropLeft = left;
		mFullPageCropTop = top;
		mFullPageCropRight = right;
		mFullPageCropBottom = bottom;
	}

	public void setGamma(boolean enable) {
		mIsGamma = enable;
	}

	public void setGamma(double gamma) {
		mGamma = gamma;
	}

	public void setGrayscale(boolean enable) {
		mIsGrayscale = enable;
	}

	public void setPictPageCrop(boolean enable) {
		mIsPictPageCrop = enable;
	}

	public void setPictPageCropBottom(int bottom) {
		mPictPageCropBottom = bottom;
	}

	public void setPictPageCropLeft(int left) {
		mPictPageCropLeft = left;
	}

	public void setPictPageCropRight(int right) {
		mPictPageCropRight = right;
	}

	public void setPictPageCropTop(int top) {
		mPictPageCropTop = top;
	}

	public void setPictPageCrop(int left, int top, int right, int bottom) {
		mPictPageCropLeft = left;
		mPictPageCropTop = top;
		mPictPageCropRight = right;
		mPictPageCropBottom = bottom;
	}

	public void setPreview(boolean enable) {
		mIsPreview = enable;
	}

	public void setResize(boolean enable) {
		mIsResize = enable;
	}

	public void setResizeDimension(Dimension size) {
		mResizeDimension.setSize(size);
	}

	public void setResizeDimension(int width, int height) {
		mResizeDimension.setSize(width, height);
	}

	public void setFixedSize(Dimension size) {
		mFixedSize.setSize(size);
	}

	public void setSplitType(int splitType) {
		setSplitType(splitType, null, null);
	}

	public void setSplitType(int splitType, float[] v, float[] h){
		mSplitType = splitType;
		if(v != null){
			mSplitOffsetV = v;
		}
		if(h != null){
			mSplitOffsetH = h;
		}
	}

	public void setSplitIndex(int index){
		mSplitIndex = index;
	}

	public float[] getSplitOffsetV(){
		return mSplitOffsetV;
	}

	public float[] getSplitOffsetH(){
		return mSplitOffsetH;
	}

	public void setTextPageCrop(boolean enable) {
		mIsTextPageCrop = enable;
	}

	public void setTextPageCropBottom(int bottom) {
		mTextPageCropBottom = bottom;
	}

	public void setTextPageCropLeft(int left) {
		mTextPageCropLeft = left;
	}

	public void setTextPageCropRight(int right) {
		mTextPageCropRight = right;
	}

	public void setTextPageCropTop(int top) {
		mTextPageCropTop = top;
	}

	public void setTextPageCrop(int left, int top, int right, int bottom) {
		mTextPageCropLeft = left;
		mTextPageCropTop = top;
		mTextPageCropRight = right;
		mTextPageCropBottom = bottom;
	}

	public void setColorPageCrop(boolean enable) {
		mIsColorPageCrop = enable;
	}

	public void setColorPageCropBottom(int bottom) {
		mColorPageCropBottom = bottom;
	}

	public void setColorPageCropLeft(int left) {
		mColorPageCropLeft = left;
	}

	public void setColorPageCropRight(int right) {
		mColorPageCropRight = right;
	}

	public void setColorPageCropTop(int top) {
		mColorPageCropTop = top;
	}

	public void setColorPageCrop(int left, int top, int right, int bottom) {
		mColorPageCropLeft = left;
		mColorPageCropTop = top;
		mColorPageCropRight = right;
		mColorPageCropBottom = bottom;
	}

	public void setTranslate(boolean enable) {
		mIsTranslate = enable;
	}

	public void setTranslateX(int x) {
		mTranslateX = x;
	}

	public void setTranslateY(int y) {
		mTranslateY = y;
	}

	public void setPageSpread(String spread){
		mPageSpread = spread;
	}

	public void setUnificationTextPage(boolean enable) {
		mIsUnificationTextPage = enable;
	}

	//public static void setUnificationTextPageSize(Dimension size) {
	//	mUnificationTextPageSize.setSize(size);
	//}

	//public static void setUnificationTextPageSize(int width, int height) {
	//	mUnificationTextPageSize.setSize(width, height);
	//}

	public boolean isEdit() {
		return (mIsFullPageCrop || mIsTextPageCrop || mIsPictPageCrop || mIsRotate || mIsTranslate || !mPageSpread.equals(Constant.PAGESPREAD_AUTO));
	}


	public ImageFilterParam createMergedFilterParam(ImageFilterParam update){
		return createMergedFilterParam(this, update);
	}

	public static ImageFilterParam createMergedFilterParam(ImageFilterParam base, ImageFilterParam update){
		if(base == null || update == null){
			return new ImageFilterParam(base);
		}

		// 有効なパラメータのみ上書きする

		ImageFilterParam dest = new ImageFilterParam(base);
		if(update.isEnable()){
			dest.mIsEnable = true;
		}
		if(update.isPreview()){
			dest.mIsPreview = true;
		}
		// これを上書きしてしまうと都合が悪い
		//if(update.isDrawCropAreaInPreview()){
		//	dest.mIsDrawCropAreaInPreview = true;
		//}
		if(update.isColorPageAutoCrop()){
			dest.mIsColorPageAutoCrop = true;
		}
		if(update.isPictPageAutoCrop()){
			dest.mIsPictPageAutoCrop = true;
		}
		if(update.isTextPageAutoCrop()){
			dest.mIsTextPageAutoCrop = true;
		}
		if(update.isFullPageAutoCrop()){
			dest.mIsFullPageAutoCrop = true;
		}

		if(update.isColorPageCrop()){
			dest.mIsColorPageCrop = true;
		}
		if(update.isColorPageCrop() || update.isColorPageAutoCrop()){
			dest.mColorPageCropLeft = update.getColorPageCropLeft();
			dest.mColorPageCropTop = update.getColorPageCropTop();
			dest.mColorPageCropRight = update.getColorPageCropRight();
			dest.mColorPageCropBottom = update.getColorPageCropBottom();
			dest.mColorPageAutoCropThreshold = update.getColorPageAutoCropThreshold();
		}
		if(update.isTextPageCrop()){
			dest.mIsTextPageCrop = true;
		}
		if(update.isTextPageCrop() || update.isTextPageAutoCrop()){
			dest.mTextPageCropLeft = update.getTextPageCropLeft();
			dest.mTextPageCropTop = update.getTextPageCropTop();
			dest.mTextPageCropRight = update.getTextPageCropRight();
			dest.mTextPageCropBottom = update.getTextPageCropBottom();
			dest.mTextPageAutoCropThreshold = update.getTextPageAutoCropThreshold();
		}
		if(update.isPictPageCrop()){
			dest.mIsPictPageCrop = true;
		}
		if(update.isPictPageCrop() || update.isPictPageAutoCrop()){
			dest.mPictPageCropLeft = update.getPictPageCropLeft();
			dest.mPictPageCropTop = update.getPictPageCropTop();
			dest.mPictPageCropRight = update.getPictPageCropRight();
			dest.mPictPageCropBottom = update.getPictPageCropBottom();
			dest.mPictPageAutoCropThreshold = update.getPictPageAutoCropThreshold();
		}
		if(update.isResize()){
			dest.mIsResize = true;
			dest.mResizeDimension.setSize(update.getResizeDimension());
		}
		if(update.isGrayscale()){
			dest.mIsGrayscale = true;
		}
		if(update.isGamma()){
			dest.mIsGamma = true;
			dest.mGamma = update.getGamma();
		}
		if(update.isContrast()){
			dest.mIsContrast = true;
			dest.mContrast = update.getContrast();
			dest.mBrightness = update.getBrightness();
		}
		if(update.isBlur()){
			dest.mIsBlur = true;
			dest.mBlurPixels = update.getBlurPixels();
		}
		if(update.isSharpness()){
			dest.mIsSharpness = true;
			dest.mSharpnessPixels = update.getSharpnessPixels();
		}
		if(update.isEqualize()){
			dest.mIsEqualize = true;
		}
		if(update.isFullPageCrop()){
			dest.mIsFullPageCrop = true;
		}
		if(update.isFullPageCrop() || update.isFullPageAutoCrop()){
			dest.mFullPageCropLeft = update.getFullPageCropLeft();
			dest.mFullPageCropTop = update.getFullPageCropTop();
			dest.mFullPageCropRight = update.getFullPageCropRight();
			dest.mFullPageCropBottom = update.getFullPageCropBottom();
			dest.mFullPageAutoCropThreshold = update.getFullPageAutoCropThreshold();
		}
		if(update.isTranslate()){
			dest.mIsTranslate = true;
			dest.mTranslateX = update.getTranslateX();
			dest.mTranslateY = update.getTranslateY();
		}
		if(update.isRotate()){
			dest.mIsRotate = true;
			dest.mRotateAngle = update.getRotateAngle();
		}
		if(update.getSplitType() != SplitFilter.TYPE_NONE){
			dest.mSplitType = update.getSplitType();
			dest.mSplitIndex = update.getSplitIndex();
			dest.mSplitOffsetV = update.getSplitOffsetV();
			dest.mSplitOffsetH = update.getSplitOffsetH();
		}
		if(update.isUnificationTextPage()){
			dest.mIsUnificationTextPage = true;
		}

		dest.mPageType = update.getPageType();

		dest.mPageSpread = update.getPageSpread();

		return dest;
	}
}
