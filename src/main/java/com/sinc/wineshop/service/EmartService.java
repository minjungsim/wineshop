package com.sinc.wineshop.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.wineshop.VO.EmartVO;
import com.sinc.wineshop.VO.FoodVO;
import com.sinc.wineshop.dao.EmartDao;

@Service("emartservice")
public class EmartService {

	@Resource(name="emartdao")
	private EmartDao dao;
	public List<EmartVO> detailEmartService(FoodVO food){
		return dao.detailEmartRow(food);
		
		
	}

	public EmartVO memoEmartService(int proid) {
		return dao.memoEmartRow(proid);
	}
}
