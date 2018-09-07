package com.sinc.wineshop.VO;

import org.springframework.web.multipart.MultipartFile;

public class ImgVO {
	private String imageFilePath ;
	/////////
	private MultipartFile file ; 
	
	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	} 
	
	
}
