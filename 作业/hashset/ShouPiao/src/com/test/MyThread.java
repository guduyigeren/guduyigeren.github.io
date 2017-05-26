package com.test;

public class MyThread extends Thread{
	ChuangKou chuangkou;
	//构造器  实现窗口检票
	public MyThread(ChuangKou chuangkou){
		this.chuangkou = chuangkou;
	}
	//run 方法
	public void run(){
		chuangkou.FangFa();
	}
}
