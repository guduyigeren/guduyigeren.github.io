package com.test3;

import java.sql.Connection;

public class ShiWu {

	public static void main(String[] args) {
		while(true){
			Connection con = ShuJuKu.getInstace();
			Connection con2 = ShuJuKu.getInstace();
			new Thread(new Xian1(con)).start();
			new Thread(new Xian2(con2)).start();
		}
	}

	
}
