package com.test2;

public class Qu implements Runnable{
	private Zhanghu zhanghu;
	private int money;
	public Qu(Zhanghu zhanghu,int money){
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
				zhanghu.qu(money);
			}
		}
	}

	public int getNumber() {
		return money;
	}

	public void setNumber(int money) {
		this.money = money;
	}

	public Zhanghu getZhanghu() {
		return zhanghu;
	}

	public void setZhanghu(Zhanghu zhanghu) {
		this.zhanghu = zhanghu;
	}

}
