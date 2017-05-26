package com.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.sql.SQLException;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

public class FuRunnable implements Runnable{
	Socket st = null;
	List<Socket> list = null;
	HashMap<String,Socket> hm = null;
	public FuRunnable(Socket st,List<Socket> list,HashMap<String,Socket> hm){
		this.st = st;
		this.list = list;
		this.hm = hm;
	}
	public void run() {
		while(true){
			try {
				//读入客户端发来的内容
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String neirong = null;
				neirong  = brr.readLine();
				//返回所有k键
				Set<String> keys = hm.keySet();
				String name = "";
				//遍历k键
				for(String s:keys){
					Socket so = hm.get(s);
					if(so==st){
						name = s;
						//System.out.println("22222");
					}
				}
				String ss = name+"说"+neirong;
				//把输入的内容添加数据库
				PreparedStatement pst = (PreparedStatement) ShuJuKu.getInstace().prepareStatement("insert into xiaoxi(xiaoxi)"+"values(?)");
				pst.setString(1, ss);
				pst.executeUpdate();
				//遍历list集合   输出name+neirong
				for(Socket skt:list){
					//写出 
					PrintWriter pw = new PrintWriter(st.getOutputStream());
					pw.write(ss+"\n");
					//System.out.println("111");
					pw.flush();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
