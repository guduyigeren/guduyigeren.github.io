package com.test;

import java.sql.*;



public class MySql {
	private static Connection con = null;
	static{
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","123");
			if(!con.isClosed()){
				System.out.println("数据库连接成功");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public MySql(){
		
	}
	public static Connection getInstace(){
		return con;
	}
}
