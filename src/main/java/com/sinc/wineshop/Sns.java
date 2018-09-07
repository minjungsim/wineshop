package com.sinc.wineshop;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Sns {
	private String type;
	private BufferedReader mIn;
	 private PrintWriter mOut;
	 Socket socket = null;
	 String serverIp = "192.168.1.153";
	 int serverPort = 5000;
	 String fileName;
	 String result;
	 String img;
	 DataInputStream in = null;

	 
	 
	 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Sns() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sns(String type) {
		
		this.type = type;
		try {
			   // 서버 연결
			   socket = new Socket(serverIp, serverPort); // socket(),connect();
			   System.out.println("서버에 연결되었습니다.");
			   System.out.println(serverIp + " : " + serverPort);

			   mOut = new PrintWriter(socket.getOutputStream());
			   mOut.println(type);
			   mOut.flush();
			   
			   in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

			      byte[] bytes = new byte[1024];
			      in.read(bytes);
			      String reply = new String(bytes, "UTF-8");
			      Thread.sleep(2000);
			      System.out.println("Reply from server: " + reply.trim());
			      //img=reply.trim();
			  
			  } catch (Exception e) {
			   e.printStackTrace();
			  } finally {
			   // 소켓 닫기 (연결 끊기)
			   try {
			    socket.close();
			   } catch (IOException e) {
			    System.out.println(e.getMessage());
			   }
			  }
	}
	
	

}
