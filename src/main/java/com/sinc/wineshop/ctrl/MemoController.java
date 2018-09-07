package com.sinc.wineshop.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.wineshop.VO.EmartVO;
import com.sinc.wineshop.VO.MemoVO;
import com.sinc.wineshop.VO.WineVO;
import com.sinc.wineshop.service.EmartService;
import com.sinc.wineshop.service.MemoService;
import com.sinc.wineshop.service.WineService;



@Controller
@RequestMapping("/memo")
public class MemoController {
	@Resource(name="memoservice")
	private MemoService memoservice;
	
	@Resource(name="wineservice")
	private WineService wineService;
	
	@Resource(name="emartservice")
	private EmartService emartService;
	
	
	@RequestMapping(value = "/registerMemo.sinc")
	public @ResponseBody List<MemoVO> registerMemo (MemoVO memo) {//userid, winename, proid
		WineVO wine= new WineVO();
		EmartVO emart= new EmartVO();
		MemoVO memoRegister= new MemoVO();
		System.out.println(memo);
		wine=wineService.readWineService(memo.getWine_name());
		emart= emartService.memoEmartService(memo.getProId());
		
		memoRegister.setUserId(memo.getUserId());
		memoRegister.setWineId(wine.getWineId());
		memoRegister.setWine_img(wine.getImg_Name());
		memoRegister.setWine_name(wine.getWine_Name());
		memoRegister.setProId(emart.getProId());
		memoRegister.setProName(emart.getProName());
		memoRegister.setProImg(emart.getImg());
		memoRegister.setPro_price(emart.getPrice());
		System.out.println(memoRegister.toString());
		
		memoservice.memoRegisterService(memoRegister);
		
		//return dummy data
		List<MemoVO> dummyList = new ArrayList<>();
		MemoVO dummyMemo = new MemoVO(9999, "dummy@dummy.dummy", 9999, "dummy", "dummy", 9999, "dummy", "dummy", 9999); 
		dummyList.add(dummyMemo);
		
		return dummyList;
	}
	
	@RequestMapping(value = "/searchMemo.sinc")
	public @ResponseBody List<MemoVO> searchMemo (String userId) {
		List<MemoVO> result = memoservice.memoService(userId);
		
		return result;
	}
	
	@RequestMapping(value="/deleteMemo.sinc")
	public @ResponseBody List<MemoVO> deleteMemo (int memoId) {
		int result = memoservice.memoDeleteService(memoId);

		//return dummy data
		List<MemoVO> dummyList = new ArrayList<>();
		MemoVO dummyMemo = new MemoVO(9999, "dummy@dummy.dummy", 9999, "dummy", "dummy", 9999, "dummy", "dummy", 9999); 
		if(result==1) {
			dummyList.add(dummyMemo);
			return dummyList;
		} 
		return null;
	}
	
	
	
	

}
