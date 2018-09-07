package com.sinc.wineshop.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.wineshop.VO.UserDTO;
import com.sinc.wineshop.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name = "userservice")
	private UserService service;

	@RequestMapping("/androidRegister.sinc")
	public @ResponseBody UserDTO androidRegister(UserDTO user) {

		System.out.println(user);

		int flag = service.registerService(user);
		if (flag != 0) {

			return user;
		}
		return null;

	}

	@RequestMapping("/androidLogin.sinc")
	public @ResponseBody UserDTO androidLogin(UserDTO user) {
		//System.out.println(user);
		// int age= Integer.parseInt(user.getParameter("userAge").substring(0, 4));
		// age=2018-age+1;
		UserDTO obj = service.loginService(user);
		if (obj != null) {
			// android로 성공 여부 전달 0: 실패 1 : 성공
			System.out.println("success login");
			System.out.println(obj);
			return obj;

		}
		return null;

	}

}
