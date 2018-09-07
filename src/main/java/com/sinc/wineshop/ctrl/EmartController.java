package com.sinc.wineshop.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.wineshop.VO.EmartVO;
import com.sinc.wineshop.VO.FoodVO;
import com.sinc.wineshop.service.EmartService;

@Controller
@RequestMapping("/emart")
public class EmartController {
	
	@Resource(name = "emartservice")
	private EmartService service;

	
	@RequestMapping("/detailFood.sinc")
	public @ResponseBody List<EmartVO> detailFood(FoodVO food){
		
		List<EmartVO> list= service.detailEmartService(food);
		System.out.println("자세히보기 출력 완료");
		return list;
	}

}
