package com.test;

public class YingHang {

	public static void main(String[] args) {
		ZhangHu zhanghu = new ZhangHu("ะกร๗",4000);
		QuThread ka = new QuThread(zhanghu,3000);
		QuThread zhe = new QuThread(zhanghu,2000);
		new Thread(ka).start();
		new Thread(zhe).start();
	}

}
