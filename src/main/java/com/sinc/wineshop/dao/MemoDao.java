package com.sinc.wineshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


import com.sinc.wineshop.VO.MemoVO;

@Repository("memodao")
public class MemoDao {
	@Resource(name="sqlSession")
	private SqlSession session;
	

	public int memoRegisterRow(MemoVO memo) {
		
		return session.insert("com.sinc.mybatis.mapper.memo.memoregisterrow", memo);
		
	}
	public List<MemoVO> memoRow(String userId) {
		System.out.println("MemoDao : " + userId);
		return session.selectList("com.sinc.mybatis.mapper.memo.memolistrow", userId);
		
	}
	
	public int memoDelete(int memoId) {
		return session.delete("com.sinc.mybatis.mapper.memo.memodeleterow", memoId);
	}

}
