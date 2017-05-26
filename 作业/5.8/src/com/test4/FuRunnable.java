package com.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FuRunnable implements Runnable{
	Socket st = null;
	List<Socket> list = null;
	HashMap<String,Socket> hm = null;

	public FuRunnable(Socket st, List<Socket> list, HashMap<String, Socket> hm) {
		this.st = st;
		this.list = list;
		this.hm = hm;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String neirong = null;
				neirong = brr.readLine();
				Set<String> keys = hm.keySet();
				String name = "";
				for(String s:keys){
					Socket so = hm.get(s);
					if(st==so){
						name = s;
					}
				}
				String s = name+"˵"+neirong;
				for(Socket skt:list){
					PrintWriter pw = new PrintWriter(skt.getOutputStream());
					pw.write(s+"\n");
					pw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
