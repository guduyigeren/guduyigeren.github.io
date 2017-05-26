package com.test;

public class ShengChan implements Runnable{
	private CangKu cangku;
	private int number;
	public ShengChan(CangKu cangku,int number){
		this.cangku = cangku;
		this.number = number;
	}
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cangku.push(number);
		}
	}
	
}
