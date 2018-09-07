package com.sinc.wineshop.ctrl;

import java.io.BufferedReader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

//import org.python.google.common.net.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


//import org.python.util.PythonInterpreter;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private static PythonInterpreter interpreter;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws InterruptedException 
	 */
	@RequestMapping("/index.sinc")
	public String home(Locale locale, Model model) throws IOException, InterruptedException {
		/*
		String line="";
		Runtime rt=Runtime.getRuntime();
		Process pc=null;
		try {
			//ProcessBuilder pb = new ProcessBuilder("python", "C:\\Users\\SSG\\Python37\\test2.py");
			Process oProcess =rt.exec("python C:\\Users\\SSG\\Python37\\final.py wine.jpg");
			System.out.println("success1");
			BufferedReader stdOut   = new BufferedReader(new InputStreamReader(oProcess.getInputStream()));
			if((line = stdOut.readLine()) != null) {
				System.out.println("read sucess");
			}else {
				System.out.println("read fail");
			}
			while ((line = stdOut.readLine()) != null)
            {
                System.out.println("Python Output: " + line);
            }
			System.out.println("exit");
			//System.out.println("Exit Code: " + oProcess.exitValue());
			//System.exit(oProcess.exitValue());
			System.out.println("exit2");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pc.waitFor();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pc.destroy();
		}

		*/
		
		System.out.println("success index");
		return "home";
	}
	

	
	
	
	
	
}
