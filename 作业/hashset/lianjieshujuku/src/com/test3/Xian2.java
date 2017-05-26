package com.test3;

import java.sql.*;

public class Xian2 implements Runnable{
	Connection con2;
	public Xian2(Connection con2){
		this.con2 = con2;
	}
	public void run() {
		String sql = "insert into shiwu values(7,'qwe')";
		PreparedStatement pst = null;
		try {
			con2.setAutoCommit(false);
			pst = con2.prepareStatement(sql);
			pst.execute();
			//Thread.sleep(10000);
			con2.commit();
		} catch (Exception e) {
			try {
				con2.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			ShuJuKu.shiyong(con2);
		}
		
	}

}
