package com.sinc.wineshop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.wineshop.VO.UserDTO;
import com.sinc.wineshop.dao.UserDao;





@Service("userservice")
public class UserService {

	@Resource(name="userdao")
	private UserDao dao;
	
	public int registerService(UserDTO user) {
		System.out.println("registerService");
		return dao.registerRow(user);
	}
	
	public UserDTO loginService(UserDTO user) {
		System.out.println("loginService");
		return dao.loginRow(user);
	}

}
