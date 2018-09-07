package com.sinc.wineshop.VO;

public class FoodImgVO {

	private String img, food_name;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public FoodImgVO(String img, String food_name) {
		super();
		this.img = img;
		this.food_name = food_name;
	}

	public FoodImgVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FoodImageVO [img=" + img + ", food_name=" + food_name + "]";
	}
	
	
}
