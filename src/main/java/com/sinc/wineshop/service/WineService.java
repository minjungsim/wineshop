package com.sinc.wineshop.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.wineshop.VO.WineVO;
import com.sinc.wineshop.dao.WineDao;

@Service("wineservice")
public class WineService {
	
	@Resource(name="winedao")
	private WineDao dao;
	
	public WineVO readService(String img) {
		return dao.readRow(img);
	}
	
	public String readFood(String type) {
		return dao.foodRow(type);
	}
	
	public WineVO readWineService(String wine_Name) {
		return dao.readWineRow(wine_Name);
	}

}
