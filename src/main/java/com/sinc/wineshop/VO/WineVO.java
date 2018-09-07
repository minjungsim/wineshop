package com.sinc.wineshop.VO;

public class WineVO {

	private int wineId;
	private String url, img_Name, wine_Name, wine_Type, wine_Country, wine_Capacity, wine_Food, sugar, acid, body, addi;
	public int getWineId() {
		return wineId;
	}
	public void setWineId(int wineId) {
		this.wineId = wineId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImg_Name() {
		return img_Name;
	}
	public void setImg_Name(String img_Name) {
		this.img_Name = img_Name;
	}
	public String getWine_Name() {
		return wine_Name;
	}
	public void setWine_Name(String wine_Name) {
		this.wine_Name = wine_Name;
	}
	public String getWine_Type() {
		return wine_Type;
	}
	public void setWine_Type(String wine_Type) {
		this.wine_Type = wine_Type;
	}
	public String getWine_Country() {
		return wine_Country;
	}
	public void setWine_Country(String wine_Country) {
		this.wine_Country = wine_Country;
	}
	public String getWine_Capacity() {
		return wine_Capacity;
	}
	public void setWine_Capacity(String wine_Capacity) {
		this.wine_Capacity = wine_Capacity;
	}
	public String getWine_Food() {
		return wine_Food;
	}
	public void setWine_Food(String wine_Food) {
		this.wine_Food = wine_Food;
	}
	public String getSugar() {
		return sugar;
	}
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAddi() {
		return addi;
	}
	public void setAddi(String addi) {
		this.addi = addi;
	}
	@Override
	public String toString() {
		return "WineVO [wineId=" + wineId + ", url=" + url + ", img_Name=" + img_Name + ", wine_Name=" + wine_Name
				+ ", wine_Type=" + wine_Type + ", wine_Country=" + wine_Country + ", wine_Capacity=" + wine_Capacity
				+ ", wine_Food=" + wine_Food + ", sugar=" + sugar + ", acid=" + acid + ", body=" + body + ", addi="
				+ addi + "]";
	}
	public WineVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WineVO(int wineId, String url, String img_Name, String wine_Name, String wine_Type, String wine_Country,
			String wine_Capacity, String wine_Food, String sugar, String acid, String body, String addi) {
		super();
		this.wineId = wineId;
		this.url = url;
		this.img_Name = img_Name;
		this.wine_Name = wine_Name;
		this.wine_Type = wine_Type;
		this.wine_Country = wine_Country;
		this.wine_Capacity = wine_Capacity;
		this.wine_Food = wine_Food;
		this.sugar = sugar;
		this.acid = acid;
		this.body = body;
		this.addi = addi;
	}
	
	

	
	
	
}
