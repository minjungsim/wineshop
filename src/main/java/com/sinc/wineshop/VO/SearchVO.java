package com.sinc.wineshop.VO;

public class SearchVO {
	private String wine_Type, sugar, acid, wine_Country;

	public String getWine_Type() {
		return wine_Type;
	}

	public void setWine_Type(String wine_Type) {
		this.wine_Type = wine_Type;
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

	public String getWine_Country() {
		return wine_Country;
	}

	public void setWine_Country(String wine_Country) {
		this.wine_Country = wine_Country;
	}

	@Override
	public String toString() {
		return "SearchVO [wine_Type=" + wine_Type + ", sugar=" + sugar + ", acid=" + acid + ", wine_Country="
				+ wine_Country + "]";
	}

	public SearchVO(String wine_Type, String sugar, String acid, String wine_Country) {
		super();
		this.wine_Type = wine_Type;
		this.sugar = sugar;
		this.acid = acid;
		this.wine_Country = wine_Country;
	}

	public SearchVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
