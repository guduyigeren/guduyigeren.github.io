package com.test;

public class QuThread implements Runnable{
	private ZhangHu zhanghu;
	private int money;
	public QuThread(ZhangHu zhanghu, int money){
		this.zhanghu = zhanghu;
		this.money = money;
	}
	public void run() {
		//ͬ�������   (��)
		synchronized (zhanghu) {
			if(zhanghu.getNumber()>=money){
				//�����˻����
				zhanghu.setNumber(zhanghu.getNumber()-money);
				System.out.println("ȡ��ɹ���ȡ��"+money+"Ԫ�������"+zhanghu.getNumber());
			}else{
				System.out.println("���㣬��ǰ�����"+zhanghu.getNumber()+"��"+(money-zhanghu.getNumber()));
				
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
