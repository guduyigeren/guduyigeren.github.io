package com.test2;

import java.sql.*;

	
public class ShuJuKu {
	private static Connection con = null;
	
	public static Connection getInstace(){
		try {
			//加载sql驱动
			Class.forName("com.mysql.jdbc.Driver");
			//找到库名  用户名 密码
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaoxi","root","123");
			if(!con.isClosed()){
				System.out.println("数据库连接成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
