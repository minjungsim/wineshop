package com.sinc.wineshop.ctrl;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.wineshop.Food;
import com.sinc.wineshop.VO.EmartVO;
import com.sinc.wineshop.VO.FoodImgVO;
import com.sinc.wineshop.VO.FoodVO;
import com.sinc.wineshop.VO.WineVO;
import com.sinc.wineshop.service.EmartService;
import com.sinc.wineshop.service.FoodImgService;
import com.sinc.wineshop.service.FoodService;
import com.sinc.wineshop.service.WineService;

@Controller
@RequestMapping("/food")
public class FoodController {
	@Resource(name="wineservice")
	private WineService service;
	@Resource(name="foodservice")
	private FoodService foodservice;
	@Resource(name="foodimgservice")
	private FoodImgService foodimgservice;
	

	@RequestMapping("/foodImage.sinc")
	public @ResponseBody List<FoodVO> foodResult(WineVO wine) throws UnknownHostException, IOException {
		System.out.println("food icon click");
		System.out.println("wine food"+wine.getWine_Food());
		System.out.println(wine.toString());
		String type=wine.getWine_Type();
		Food beforeFood= new Food(type);
		System.out.println("--------------1");
		String foodMatching= wine.getWine_Food();

		
		int cnt=0;
		String[] arrMatch;
		String[] arrSns;
		ArrayList<FoodVO> findFood= new ArrayList<>();
		arrMatch=foodMatching.split(",");// foodmatching food
		System.out.println("arrMatch"+ arrMatch[0]);
		//String snsData= service.readFood(type); //sns food
		String snsData=beforeFood.getResult();// sns food
		System.out.println("python to java sns data : "+snsData);
		arrSns=snsData.split("\'");
		ArrayList<String> afterArr= new ArrayList<>();
		for(int i=1;i<arrSns.length;i=i+2) {
			afterArr.add(arrSns[i]);
		}
		FoodVO foodObj;
		FoodImgVO foodObj2= new FoodImgVO();
		List<FoodVO> foodResult= new ArrayList<>();
		
		for(int k=0;k<arrMatch.length;k++) {
			for(int l=0;l<afterArr.size();l++) {
				if(arrMatch[k].equals(afterArr.get(l))) {
					foodObj= new FoodVO("null",afterArr.get(l).toString(),"Y", "Y");
					System.out.println(foodObj.toString());
					findFood.add(foodObj);
					break;					
				}
			}
		}
		for(int i=0; i<arrMatch.length;i++) {
			cnt=0;
			for(int j=0;j<findFood.size();j++) {
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
				String name=afterArr.get(i).toString();
				System.out.println("name: "+name);
				if(foodimgservice.readFood(afterArr.get(i).toString())!=null) {
					System.out.println("--------in foodimg ----------"+afterArr.get(i).toString());
					findFood.add(foodObj);
				}
				
				cnt=0;
			}
		}
		
		for(int i=0;i<findFood.size();i++) {
			foodObj=new FoodVO();
			//System.out.println(findFood.get(i).toString());
			foodObj2= foodimgservice.readFood(findFood.get(i).getFood_name());
			//System.out.println("foodObj2:"+foodObj2.toString());
			
			foodObj.setFood_img(foodObj2.getImg());
			foodObj.setFood_name(foodObj2.getFood_name());
			foodObj.setExpert(findFood.get(i).getExpert());
			foodObj.setSns(findFood.get(i).getSns());
			//System.out.println("foodObj  "+foodObj.toString());
			foodResult.add(foodObj);
			//System.out.println("**********"+foodResult.toString());
		}
		System.out.println("완료");
		System.out.println(foodResult.toString());
		return foodResult;
	}
	//@RequestMapping("/detailFood.sinc")
	//public @ResponseBody List<FoodVO> foodResult(WineVO wine)
}
