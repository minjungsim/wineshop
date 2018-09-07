package com.sinc.wineshop.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.wineshop.VO.MemoVO;
import com.sinc.wineshop.dao.MemoDao;


@Service("memoservice")
public class MemoService {

	@Resource(name="memodao")
	private MemoDao dao;
	public int memoRegisterService(MemoVO memo){
		return dao.memoRegisterRow(memo);
	}
	
	public List<MemoVO> memoService(String userId){
		System.out.println("MemoService : " + userId);
		return dao.memoRow(userId);
	}
	
	public int memoDeleteService(int memoId) {
		return dao.memoDelete(memoId);
	}
}
