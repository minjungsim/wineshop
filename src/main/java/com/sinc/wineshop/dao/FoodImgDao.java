package com.sinc.wineshop.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.wineshop.VO.FoodImgVO;


@Repository("foodimgdao")
public class FoodImgDao {
	@Resource(name="sqlSession")
	private SqlSession session;
	
	public FoodImgVO foodReadRow(String foodName) {
		
		return session.selectOne("com.sinc.mybatis.mapper.foodimg.foodReadRow", foodName);
		
	}

}
