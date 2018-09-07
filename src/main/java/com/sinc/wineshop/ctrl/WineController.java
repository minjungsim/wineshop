package com.sinc.wineshop.ctrl;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sinc.wineshop.Client;
import com.sinc.wineshop.VO.ImgVO;
import com.sinc.wineshop.VO.WineVO;
import com.sinc.wineshop.service.WineService;


@Controller
@RequestMapping("/wine")
public class WineController {

	@Resource(name="wineservice")
	private WineService service;
	
	
	@RequestMapping(value = "/imageUpload.sinc")
	@ResponseBody
	public WineVO fileUpload(ImgVO img,MultipartFile uploaded_file) { // 이미지를 jsp로 받아서 dir 저장
		//filename
		//MultipartFile file = img.getFile() ; 
		String path = "C:/Users/SSG/PycharmProjects/wine5/" ;
		System.out.println("path >> "+path);
		System.out.println("img  >> "+uploaded_file.getOriginalFilename());
		WineVO wine = null ;
		try {
			if(uploaded_file.getOriginalFilename() == null || uploaded_file.getOriginalFilename() == "") {
				System.out.println(">>> image is null");
				return null;
			}else {
				//String originalFileName=uploaded_file.renameTo( "wine.jpg" );
				//String originalFileName = uploaded_file.getOriginalFilename() ;
				String originalFileName="wine.jpg";
				System.out.println(">>> image is not null");
				byte [] data = uploaded_file.getBytes() ; 
				FileOutputStream out = new FileOutputStream(path+originalFileName) ;
				out.write(data) ; 
				Thread.sleep(2000);
				Client client= new Client("wine.jpg");
				System.out.println("opencv success");
				String resultImg =  client.getImg();
				
				wine = service.readService(resultImg);
				System.out.println(wine);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return wine ;
		
	}
	

}
