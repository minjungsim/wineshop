package com.sinc.wineshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.wineshop.VO.EmartVO;
import com.sinc.wineshop.VO.FoodVO;

@Repository("emartdao")
public class EmartDao {

	@Resource(name = "sqlSession")
	private SqlSession session;

	public List<EmartVO> detailEmartRow(FoodVO food) {

		return session.selectList("com.sinc.mybatis.mapper.emart.detailemartrow", food);

	}

	
	public EmartVO memoEmartRow(int proid) {
		return session.selectOne("com.sinc.mybatis.mapper.emart.memoEmartRow", proid);
	}

}
