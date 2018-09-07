package com.sinc.wineshop;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Food {

	private BufferedReader mIn;
	private PrintStream mOut;
	Socket socket = null;
	String serverIp = "10.149.179.33";
	int serverPort = 5001;
	String type;
	String fileName;
	String result;
	String img;
	DataInputStream in = null;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Food(String type) throws UnknownHostException, IOException {
		super();
		this.type = type;
		try {
			// 서버 연결
			socket = new Socket(serverIp, serverPort); // socket(),connect();
			System.out.println("서버에 연결되었습니다.");
			System.out.println(serverIp + " : " + serverPort);

			mOut = new PrintStream(socket.getOutputStream());
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

			mOut.println(type);
			mOut.flush();

			byte[] bytes = new byte[1024];
			in.read(bytes);
			String reply = new String(bytes, "UTF-8");
			Thread.sleep(2000);
			System.out.println("Reply from server: " + reply.trim());
			result= reply.trim();
			// img=reply.trim();

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

	public Food() throws UnknownHostException, IOException {
		super();
		// TODO Auto-generated constructor stub

		socket = new Socket(serverIp, serverPort); // socket(),connect();
		System.out.println("서버에 연결되었습니다.");
		System.out.println(serverIp + " : " + serverPort);
		try {
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
