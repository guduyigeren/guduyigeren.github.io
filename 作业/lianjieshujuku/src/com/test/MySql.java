package com.test;

import java.sql.*;



public class MySql {
	private static Connection con = null;
	static{
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","123");
			if(!con.isClosed()){
				System.out.println("���ݿ����ӳɹ�");
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
