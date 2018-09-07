package com.sinc.wineshop.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.wineshop.VO.FoodVO;

@Repository("fooddao")
public class FoodDao {
	@Resource(name="sqlSession")
	private SqlSession session;
	
	public FoodVO foodReadRow(String foodName) {
		
		return session.selectOne("com.sinc.mybatis.mapper.food.foodReadRow", foodName);
		
	}

}
