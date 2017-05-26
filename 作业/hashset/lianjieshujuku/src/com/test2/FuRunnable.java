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
				//����ͻ��˷���������
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String neirong = null;
				neirong  = brr.readLine();
				//��������k��
				Set<String> keys = hm.keySet();
				String name = "";
				//����k��
				for(String s:keys){
					Socket so = hm.get(s);
					if(so==st){
						name = s;
						//System.out.println("22222");
					}
				}
				String ss = name+"˵"+neirong;
				//�����������������ݿ�
				PreparedStatement pst = (PreparedStatement) ShuJuKu.getInstace().prepareStatement("insert into xiaoxi(xiaoxi)"+"values(?)");
				pst.setString(1, ss);
				pst.executeUpdate();
				//����list����   ���name+neirong
				for(Socket skt:list){
					//д�� 
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
