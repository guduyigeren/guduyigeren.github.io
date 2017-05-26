package com.test;

public class XiaoFei implements Runnable{
	private CangKu cangku;
	private int number;
	public XiaoFei(CangKu cangku,int number){
		this.cangku = cangku;
		this.setNumber(number);
	}
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cangku.pop(number);
		}
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
