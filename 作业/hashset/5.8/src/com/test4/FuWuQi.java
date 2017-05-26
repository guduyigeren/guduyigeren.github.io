package com.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class FuWuQi {

	public static void main(String[] args) {
		
		ServerSocket sst = null;
		Socket st = null;
		List<Socket> list = new ArrayList<Socket>();
		HashMap<String,Socket> hm = new HashMap<String,Socket>();
		try {
			sst = new ServerSocket(8888);
			while(true){
				st = sst.accept();
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String name = brr.readLine();
				hm.put(name, st);
				list.add(st);
				new Thread(new FuRunnable(st,list,hm)).start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
