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
					System.out.println("连接数据库成功");
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
			//判断conn中是否有连接
			if(conn.size()>0){
				//返回连接
				System.out.println("有人借走了一条连接");
				return conn.removeFirst();
			}else{
				try {
					//挂起等待
					System.out.println("连接没了，等待归还");
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
			System.out.println("有人换回一条连接");
			conn.add(con);
			conn.notifyAll();
		}
	} 
}
