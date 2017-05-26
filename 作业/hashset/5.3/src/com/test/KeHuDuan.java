package com.test;

import java.io.*;
import java.net.Socket;

public class KeHuDuan {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			System.out.println("正在连接");
			socket = new Socket("192.168.199.166",8961);
			String s = "hello";
			//向服务器端发送数据
			System.out.println("连接成功，正在向服务器发送数据");
			OutputStream outputstream = socket.getOutputStream();
			outputstream.write(s.getBytes());
			outputstream.flush();
			socket.shutdownOutput();
			//接受服务器返回来的数据
			System.out.println("正在接受服务器返回的消息");
			InputStream inputstream = socket.getInputStream();
			int len = 0;
			byte[] bytes = new byte[1024];
			StringBuffer stringbuffer = new StringBuffer();
			while((len = inputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes,0,len));
			}
			System.out.println("服务器端返回内容为:"+stringbuffer);
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
						socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
