package com.sinc.wineshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.springframework.web.bind.annotation.ResponseBody;

public class TestMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//Client client= new Client("wine.jpg");
		//System.out.println("socket 완료");
		Food food= new Food("레드와인");
		/*
		Runtime rt=Runtime.getRuntime();
		
		ProcessBuilder pb = null ; 
		Process proc = null;
		InputStream stderr = null;
		String type="레드와인";
		try {
			pb = new ProcessBuilder("python", "C:\\Users\\SSG\\PycharmProjects\\wine5\\sns_result.py");
			pb.redirectErrorStream(false);
			proc = pb.start() ;
			proc = Runtime.getRuntime().exec("python C:\\Users\\SSG\\Python37\\match_test.py matching_img wine.jpg");
			
			proc = Runtime.getRuntime().exec("python C:\\Users\\SSG\\Python37\\TestModule.py add 1 2");
			stderr = proc.getErrorStream();
			
			System.out.println("성공");
			
			String str = "" ; 
			BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream(), "utf-8"));
			//BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream(), "utf-8"));
			if(proc != null ) {
				proc.waitFor();
			}
			while( (type = reader.readLine()) != null ) {
				System.out.println("result >> "+type);
			}
			reader.close();
			System.out.println("success");
			
			
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("python") ;
			System.out.println(">>>>>>>>>>>> "+engine);
			engine.eval(Files.newBufferedReader(Paths.get("C:\\\\Users\\\\SSG\\\\PycharmProjects\\\\wine5\\\\sns_result.py"), StandardCharsets.UTF_8));
			Invocable invoke = (Invocable)engine;
			String result = (String)invoke.invokeFunction("findWord",type);
			System.out.println("result : "+result);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//pc.destroy();
			
		}
		*/
		 /*
		
			String lb_type="스테이크, 파스타, 감바스";
			String sns_food="스테이크, 치즈, 파스타";
			int cnt=0;
			String[] arrMatch;
			String[] arrSns;
			ArrayList<FoodVO> findFood= new ArrayList<>();
			arrMatch=lb_type.split(",");// foodmatching food
			//String snsData= service.readFood(type);
			arrSns=sns_food.split(",");
			FoodVO foodObj;
			
			for(int k=0;k<arrMatch.length;k++) {
				for(int l=0;l<arrSns.length;l++) {
					if(arrMatch[k].equals(arrSns[l])) {
						System.out.println(arrMatch[k] + "  +  " + arrSns[l]);
						foodObj= new FoodVO("null",arrSns[l],"Y", "Y");
						findFood.add(foodObj);
						System.out.println("findfood"+findFood.toString());
						System.out.println("result");
						break;					
					}
				}
			}
			for(int i=0; i<arrMatch.length;i++) {
				cnt=0;
				for(int j=0;j<findFood.size();j++) {
					if(findFood.get(j).getFood_name().equals(arrMatch[i])) {
						cnt=1;
						break;
					}
				}
				if(cnt==0) {
					foodObj= new FoodVO("null", arrMatch[i], "Y", "N");
					findFood.add(foodObj);
				}
			}
			for(int i=0; i<arrSns.length;i++) {
				cnt=0;
				for(int j=0;j<findFood.size();j++) {
					if(findFood.get(j).getFood_name().equals(arrSns[i])) {
						cnt=1;
						break;
						
					}
				}
				if(cnt==0) {
					foodObj= new FoodVO("null", arrSns[i], "N", "Y");
					findFood.add(foodObj);
					cnt=0;
				}
			}
			for(int i=0;i<findFood.size();i++) {
				System.out.println(findFood.get(i).toString());
			}
			*/
	}
	
}

			



