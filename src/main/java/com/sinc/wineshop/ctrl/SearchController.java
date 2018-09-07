package com.sinc.wineshop.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.wineshop.VO.SearchVO;
import com.sinc.wineshop.VO.WineVO;
import com.sinc.wineshop.service.SearchService;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Resource(name="searchservice")
	private SearchService service;
	
	@RequestMapping("/searchDetail.sinc")
	@ResponseBody
	public List<WineVO> searchDetail (SearchVO data){
		if(data.getWine_Type() !=null || data.getWine_Country() !=null || data.getSugar()!=null || data.getAcid()!=null) {
			return service.searchDetailService(data);
		}
		System.out.println("찾을 데이터 조건이 없습니다.");
		return null;
		
		
	}
}
