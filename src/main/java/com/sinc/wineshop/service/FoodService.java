package com.sinc.wineshop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.wineshop.VO.FoodVO;
import com.sinc.wineshop.dao.FoodDao;

@Service("foodservice")
public class FoodService {

	@Resource(name="fooddao")
	private FoodDao dao;
	
	
	
	public FoodVO readFood(String foodName) {
		return dao.foodReadRow(foodName);
	}
}
