package com.test;

public class QuThread implements Runnable{
	private ZhangHu zhanghu;
	private int money;
	public QuThread(ZhangHu zhanghu, int money){
		this.zhanghu = zhanghu;
		this.money = money;
	}
	public void run() {
		//同步代码块   (锁)
		synchronized (zhanghu) {
			if(zhanghu.getNumber()>=money){
				//计算账户余额
				zhanghu.setNumber(zhanghu.getNumber()-money);
				System.out.println("取款成功，取走"+money+"元，余额是"+zhanghu.getNumber());
			}else{
				System.out.println("余额不足，当前余额是"+zhanghu.getNumber()+"差"+(money-zhanghu.getNumber()));
				
			}
		}
	}
	public int getNumber() {
		return money;
	}
	public void setNumber(int number) {
		this.money = number;
	}

}
