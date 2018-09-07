package com.sinc.wineshop.VO;

public class FoodVO {

	private String food_img, food_name,expert, sns ;

	public String getFood_img() {
		return food_img;
	}

	public void setFood_img(String food_img) {
		this.food_img = food_img;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getExpert() {
		return expert;
	}

	public void setExpert(String expert) {
		this.expert = expert;
	}

	public String getSns() {
		return sns;
	}

	public void setSns(String sns) {
		this.sns = sns;
	}

	public FoodVO(String food_img, String food_name, String expert, String sns) {
		super();
		this.food_img = food_img;
		this.food_name = food_name;
		this.expert = expert;
		this.sns = sns;
	}

	public FoodVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FoodVO [food_img=" + food_img + ", food_name=" + food_name + ", expert=" + expert + ", sns=" + sns
				+ "]";
	}
	
	
}
