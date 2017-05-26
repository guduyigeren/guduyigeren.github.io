package com.test;

public class ShouPiao {
	static int piaoshu = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChuangKou chuangkou1 = new ChuangKou(piaoshu,"窗口一");
		ChuangKou chuangkou2 = new ChuangKou(piaoshu,"窗口二");
		ChuangKou chuangkou3 = new ChuangKou(piaoshu,"窗口三");
		MyThread ck1 = new MyThread(chuangkou1);
		MyThread ck2 = new MyThread(chuangkou2);
		MyThread ck3 = new MyThread(chuangkou3);
		ck1.start();
		ck2.start();
		ck3.start();
	}

}
