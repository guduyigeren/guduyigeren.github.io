package com.test2;

public class Yinghang {

	public static void main(String[] args) {
		Zhanghu zhanghu = new Zhanghu("xiaoming",4000);
		//实现取钱
		Qu ka = new Qu(zhanghu,2000);
		Qu zhe = new Qu(zhanghu,1000);
		//实现存钱
		Cun cun1 = new Cun(zhanghu,1000);
		
		new Thread(ka).start();
		new Thread(zhe).start();
		new Thread(cun1).start();
	}

}
