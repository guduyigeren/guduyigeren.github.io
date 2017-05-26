package com.test;

import java.io.*;

import java.net.ServerSocket;
import java.net.Socket;

public class FuWuDuan {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			//创建服务端
			serversocket = new ServerSocket(8961);
			System.out.println("创建成功");
			socket = serversocket.accept();//返回客户端
			System.out.println("连接成功正在读取数据");
			
			//接受客户端发来的消息
			InputStream inputstream = socket.getInputStream();
			int len = 0;
			byte[] bytes = new byte[1024];
			StringBuffer stringbuffer = new StringBuffer();
			while((len = inputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes,0,len));
				len=0;
			}
			System.out.println("客户端发来的消息："+stringbuffer);
			String s = "我收到消息："+stringbuffer.toString();
			
			//将数据发送到客户端
			System.out.println("正在向客户端返回消息");
			OutputStream outputstream = socket.getOutputStream();
			outputstream.write(s.getBytes());
			outputstream.flush();
			outputstream.close();//关闭输出流
			inputstream.close();//关闭输入流
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭客户端
			System.out.println("关闭连接");
			if(socket!=null){
				if(socket.isConnected()){
					try {
						//socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
			//关闭服务端
			if(serversocket!=null){
				if(!serversocket.isClosed()){
					try {
						//serversocket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
