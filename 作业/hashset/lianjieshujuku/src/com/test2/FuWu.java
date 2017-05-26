package com.test2;

//import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;

//import com.mysql.fabric.xmlrpc.base.Array;
//import com.mysql.jdbc.Connection;

public class FuWu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket sst = null;
		Socket st = null;
		ArrayList<Socket> list = new ArrayList<Socket>();
		HashMap<String,Socket> hm = new HashMap<String,Socket>();
		try {
			sst = new ServerSocket(8889);
			while(true){
				st = sst.accept();
				//读入
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				//只读一行
				String name = brr.readLine();
				hm.put(name, st);
				list.add(st);
				//启动服务器线程
				new Thread(new FuRunnable(st, list, hm)).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
