package com.test;

import java.io.*;
import java.net.Socket;

public class FuWu {

	public static void main(String[] args) {
		try {
			//
			Socket socket = new Socket("192.168.199.166",9878);
			OutputStream out = (OutputStream) socket.getOutputStream();
			out.write("我是老司机".getBytes());//输出流写出
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
