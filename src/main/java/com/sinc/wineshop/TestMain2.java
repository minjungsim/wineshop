package com.sinc.wineshop;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.sinc.wineshop.VO.FoodVO;

public class TestMain2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//String type=wine.getWine_Type();
		String type="레드와인";
		Food beforeFood= new Food(type);
		//String foodMatching= wine.getWine_Food();
		String foodMatching="스테이크,파스타,크림파스타,감바스";
		int cnt=0;
		String[] arrMatch;
		String[] arrSns;
		ArrayList<FoodVO> findFood= new ArrayList<>();
		arrMatch=foodMatching.split(",");// foodmatching food
		//String snsData= service.readFood(type); //sns food
		String snsData=beforeFood.result;// sns food
		System.out.println(snsData);
		arrSns=snsData.split("\'");
		ArrayList<String> afterArr= new ArrayList<>();
		System.out.println(arrSns.length);
		for(int i=1;i<arrSns.length;i=i+2) {
			afterArr.add(arrSns[i]);
		}
		
		FoodVO foodObj;
		FoodVO foodObj2= new FoodVO();
		List<FoodVO> foodResult= new ArrayList<>();

		for(int k=0;k<arrMatch.length;k++) {
			for(int l=0;l<afterArr.size();l++) {
				if(arrMatch[k].equals(afterArr.get(l))) {
					foodObj= new FoodVO("null",afterArr.get(l).toString(),"Y", "Y");
					findFood.add(foodObj);
					break;					
				}
			}
		}
		for(int i=0; i<arrMatch.length;i++) {
			System.out.println("arrMatch>>>>>>>>>"+arrMatch[i]);
			cnt=0;
			for(int j=0;j<findFood.size();j++) {
				System.out.println("findFood>>>>>>>"+findFood.get(j));
				System.out.println();
				if(findFood.get(j).getFood_name().equals(arrMatch[i])) {
					cnt=1;					
					break;
				}
			}
			if(cnt==0) {
				foodObj= new FoodVO("null", arrMatch[i], "Y", "N");
				findFood.add(foodObj);
			}
		}
		for(int i=0; i<afterArr.size();i++) {
			cnt=0;
			for(int j=0;j<findFood.size();j++) {
				if(findFood.get(j).getFood_name().equals(afterArr.get(i))) {
					cnt=1;
					break;
					
				}
			}
			if(cnt==0) {
				foodObj= new FoodVO("null", afterArr.get(i).toString(), "N", "Y");
				findFood.add(foodObj);
				cnt=0;
			}
		}
		for(int i=0;i<findFood.size();i++) {
			System.out.println(findFood.get(i).toString());
			//foodObj2= foodservice.readFood(findFood.get(i));
			foodObj2.setExpert(findFood.get(i).getExpert());
			foodObj2.setSns(findFood.get(i).getSns());
			foodResult.add(foodObj2);
		}
		
		
	}

}
