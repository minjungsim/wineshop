package com.sinc.wineshop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.wineshop.VO.FoodImgVO;
import com.sinc.wineshop.VO.FoodVO;
import com.sinc.wineshop.dao.FoodImgDao;

@Service("foodimgservice")
public class FoodImgService {
	@Resource(name="foodimgdao")
	private FoodImgDao dao;
	public FoodImgVO readFood(String foodName) {
		return dao.foodReadRow(foodName);
	}

}
