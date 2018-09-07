package com.sinc.wineshop.VO;

public class EmartVO {
	private int proId, price;
	private String proName, lcode, mcode, scode, keyword, img;
	public EmartVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "EmartVO [proId=" + proId + ", price=" + price + ", proName=" + proName + ", lcode=" + lcode + ", mcode="
				+ mcode + ", scode=" + scode + ", keyword=" + keyword + ", img=" + img + "]";
	}
	public EmartVO(int proId, int price, String proName, String lcode, String mcode, String scode, String keyword,
			String img) {
		super();
		this.proId = proId;
		this.price = price;
		this.proName = proName;
		this.lcode = lcode;
		this.mcode = mcode;
		this.scode = scode;
		this.keyword = keyword;
		this.img = img;
	}
	
	
	
	
}
