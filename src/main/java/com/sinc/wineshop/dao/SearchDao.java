package com.sinc.wineshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.wineshop.VO.SearchVO;
import com.sinc.wineshop.VO.WineVO;

@Repository("searchdao")
public class SearchDao {
	@Resource(name="sqlSession")
	private SqlSession session;
	
	public List<WineVO> searchRow(SearchVO data){
		return session.selectList("com.sinc.mybatis.mapper.search.searchRow", data);
	}
}
