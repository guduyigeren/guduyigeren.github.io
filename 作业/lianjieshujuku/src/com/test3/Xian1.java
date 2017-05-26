package com.test3;

import java.sql.*;

public class Xian1 implements Runnable{
	Connection con;
	public Xian1(Connection con){
		this.con = con;
	}
	public void run() {
		String sql = "update shiwu set name = 'a' where id = 1";
		PreparedStatement pst = null;
		try {
			con.setAutoCommit(false);
			pst = con.prepareStatement(sql);
			pst.execute();
			
			//Thread.sleep(10000);
			
			con.commit();
			
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			ShuJuKu.shiyong(con);
		}
	}

}
