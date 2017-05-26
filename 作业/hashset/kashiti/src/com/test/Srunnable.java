package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Srunnable implements Runnable{

	@Override
	public void run() {
		while(true){
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			System.out.println(s.format( date));
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
