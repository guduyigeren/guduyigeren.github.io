package com.test;
import java.io.*;
import java.net.*;
public class KeHu {

	public static void main(String[] args) {
		try {
			//连接端口
			Socket skt = new Socket("192.168.199.166",1456);
			
			System.out.println("是否连接成功"+skt.isConnected());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
