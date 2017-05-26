package com.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class KeHuDuan {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			//创建端口
			serversocket = new  ServerSocket(9878);
			System.out.println("服务器端口创建成功");
			while(true){
				//监听端口
				socket = serversocket.accept();
				System.out.println("正在监听端口");
				
				InputStream inputstream = socket.getInputStream();
				byte [] bytes = new byte[1024];
				int len = 0;
				StringBuffer stringbuffer = new StringBuffer();
				while((len = inputstream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("服务器端:你是干嘛的");
				System.out.println("客户端："+stringbuffer.toString());
				inputstream.close();
				//来访人ip地址
				String address = new String(socket.getInetAddress().getHostAddress());
				System.out.println("有人来访问地址是"+address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
