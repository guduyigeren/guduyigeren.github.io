package com.test;

public class Deom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CangKu cangku = new CangKu(0);
		XiaoFei xiaofei1 = new XiaoFei(cangku,20);
		XiaoFei xiaofei2 = new XiaoFei(cangku,40);
		XiaoFei xiaofei3 = new XiaoFei(cangku,80);
		ShengChan shengchan1 = new ShengChan(cangku,20);
		ShengChan shengchan2 = new ShengChan(cangku,40);
		ShengChan shengchan3 = new ShengChan(cangku,60);
		new Thread(xiaofei1).start();
		new Thread(xiaofei2).start();
		new Thread(xiaofei3).start();
		new Thread(shengchan1).start();
		new Thread(shengchan2).start();
		new Thread(shengchan3).start();
	}

}
