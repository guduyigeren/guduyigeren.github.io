package com.test;

public class MyThread extends Thread{
	ChuangKou chuangkou;
	//������  ʵ�ִ��ڼ�Ʊ
	public MyThread(ChuangKou chuangkou){
		this.chuangkou = chuangkou;
	}
	//run ����
	public void run(){
		chuangkou.FangFa();
	}
}
