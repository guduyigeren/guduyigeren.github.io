package com.test3;

import java.sql.*;
import java.util.*;


public class ShuJuKu {
	
	private static LinkedList<Connection>  conn = new LinkedList<Connection>();
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			for(int i=0;i<10;i++){
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiwu","root","123");
				if(!con.isClosed()){
					System.out.println("�������ݿ�ɹ�");
					conn.add(con);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ShuJuKu(){
		
	}
	public static Connection getInstace(){
		while(true){
			synchronized(conn){
			//�ж�conn���Ƿ�������
			if(conn.size()>0){
				//��������
				System.out.println("���˽�����һ������");
				return conn.removeFirst();
			}else{
				try {
					//����ȴ�
					System.out.println("����û�ˣ��ȴ��黹");
					conn.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
		}
		
	}
	public static void shiyong(Connection con){
		synchronized (conn) {
			System.out.println("���˻���һ������");
			conn.add(con);
			conn.notifyAll();
		}
	} 
}
