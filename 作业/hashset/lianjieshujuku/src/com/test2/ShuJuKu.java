package com.test2;

import java.sql.*;

	
public class ShuJuKu {
	private static Connection con = null;
	
	public static Connection getInstace(){
		try {
			//����sql����
			Class.forName("com.mysql.jdbc.Driver");
			//�ҵ�����  �û��� ����
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaoxi","root","123");
			if(!con.isClosed()){
				System.out.println("���ݿ����ӳɹ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
