package com.sinc.wineshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.wineshop.VO.UserDTO;

@Repository("userdao")
public class UserDao {

	@Resource(name="sqlSession")
	private SqlSession session;

	public int registerRow(UserDTO user) {
		// TODO Auto-generated method stub
		System.out.println(">>Dao user register");
		return session.insert("com.sinc.mybatis.mapper.user.registerRow", user);
		
	}
	
	public UserDTO loginRow(UserDTO user) {
		// TODO Auto-generated method stub
		System.out.println(">>Dao user login");
		return session.selectOne("com.sinc.mybatis.mapper.user.loginRow", user);
		
	}
}
