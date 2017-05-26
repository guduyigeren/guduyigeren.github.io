package com.test;
import java.io.IOException;
import java.net.*;
public class KeHuDuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建端口
		try{
			ServerSocket ssr = new ServerSocket(1456);
			System.out.println("服务器端创建成功");
			//监听端口
			Socket skt = ssr.accept();
			System.out.println("正在监听端口");
			//来访ip地址
			String address = skt.getLocalAddress().getHostAddress();
			System.out.println("有人来访问的地址"+address);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
