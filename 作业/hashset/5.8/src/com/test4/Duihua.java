package com.test4;

import java.io.*;
import java.net.Socket;

import org.omg.CORBA.Principal;

public class Duihua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket st = null;
		try {
			st = new Socket("192.168.199.165",8888);
			//告诉服务器是谁
			PrintWriter pw = new PrintWriter(st.getOutputStream());
			pw.write("小明/n");
			new JieMian(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
