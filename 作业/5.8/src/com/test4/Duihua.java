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
			//���߷�������˭
			PrintWriter pw = new PrintWriter(st.getOutputStream());
			pw.write("С��/n");
			new JieMian(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
