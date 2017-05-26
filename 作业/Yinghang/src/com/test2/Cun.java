package com.test2;

public class Cun implements Runnable{
	private Zhanghu zhanghu;
	private int money;
	public Cun(Zhanghu zhanghu,int money){
		this.zhanghu = zhanghu;
		this.money = money;
	}
	public void run() {
		while(true){
			synchronized (zhanghu) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				zhanghu.cun(money);
			}
		}
	}
	public Zhanghu getZhanghu() {
		return zhanghu;
	}
	public void setZhanghu(Zhanghu zhanghu) {
		this.zhanghu = zhanghu;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
