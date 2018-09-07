package com.sinc.wineshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.wineshop.VO.WineVO;



@Repository("winedao")
public class WineDao {
	@Resource(name="sqlSession")
	private SqlSession session;
	
	public WineVO readRow(String img) {
		
		return session.selectOne("com.sinc.mybatis.mapper.wine.readRow", img);
		
	}
	
	public String foodRow(String type) {
		return session.selectOne("com.sinc.mybatis.mapper.wine.foodRow",type);
	}
	public WineVO readWineRow(String wine_Name) {
		
		return session.selectOne("com.sinc.mybatis.mapper.wine.readwineRow", wine_Name);
		
	}
	

}
