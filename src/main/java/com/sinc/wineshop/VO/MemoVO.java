package com.sinc.wineshop.VO;

public class MemoVO {

	private int memoId;
	private String userId;
	private int wineId;
	private String wine_img, wine_name;
	private int proId;
	private String proName, proImg;
	private int pro_price;
	
	public int getMemoId() {
		return memoId;
	}
	public void setMemoId(int memoId) {
		this.memoId = memoId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getWineId() {
		return wineId;
	}
	public void setWineId(int wineId) {
		this.wineId = wineId;
	}
	public String getWine_img() {
		return wine_img;
	}
	public void setWine_img(String wine_img) {
		this.wine_img = wine_img;
	}
	public String getWine_name() {
		return wine_name;
	}
	public void setWine_name(String wine_name) {
		this.wine_name = wine_name;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProImg() {
		return proImg;
	}
	public void setProImg(String proImg) {
		this.proImg = proImg;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public MemoVO(int memoId, String userId, int wineId, String wine_img, String wine_name, int proId, String proName,
			String proImg, int pro_price) {
		super();
		this.memoId = memoId;
		this.userId = userId;
		this.wineId = wineId;
		this.wine_img = wine_img;
		this.wine_name = wine_name;
		this.proId = proId;
		this.proName = proName;
		this.proImg = proImg;
		this.pro_price = pro_price;
	}
	public MemoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MemoVO [memoId=" + memoId + ", userId=" + userId + ", wineId=" + wineId + ", wine_img=" + wine_img
				+ ", wine_name=" + wine_name + ", proId=" + proId + ", proName=" + proName + ", proImg=" + proImg
				+ ", pro_price=" + pro_price + "]";
	}
	
	
}
