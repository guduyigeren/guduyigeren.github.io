package com.test2;

public class Zhanghu {
	
	private String name;
	private int number;
	public Zhanghu(String name,int number){
		this.name = name;
		this.number = number;
	}
	//取钱
	public void qu(int mon){
		//取钱数大于与余额
		if(mon>number){
			System.out.println("余额不足"+mon+"元"+"余额是"+number);
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			//计算去款金额
			number = number-mon;
			System.out.println("取款成功，取款"+mon+"元"+"余额是"+number+"元");
		}
		notifyAll();
	}
	//存钱
	public void cun(int mon){
		number= number+mon; //计算存入后的余额
		System.out.println("存款成功，存款"+mon+"元"+"余额是"+number+"元");
	}
	
	
	public int getMondy() {
		return number;
	}
	public void setMondy(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
