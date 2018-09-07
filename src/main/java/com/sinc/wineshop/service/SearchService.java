package com.sinc.wineshop.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.wineshop.VO.SearchVO;
import com.sinc.wineshop.VO.WineVO;
import com.sinc.wineshop.dao.SearchDao;



@Service("searchservice")
public class SearchService {

	@Resource(name="searchdao")
	private SearchDao dao;
	
	public List<WineVO> searchDetailService(SearchVO data){
		return dao.searchRow(data);
	}
}
