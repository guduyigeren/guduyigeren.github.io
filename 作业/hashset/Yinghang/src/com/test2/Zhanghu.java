package com.test2;

public class Zhanghu {
	
	private String name;
	private int number;
	public Zhanghu(String name,int number){
		this.name = name;
		this.number = number;
	}
	//ȡǮ
	public void qu(int mon){
		//ȡǮ�����������
		if(mon>number){
			System.out.println("����"+mon+"Ԫ"+"�����"+number);
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			//����ȥ����
			number = number-mon;
			System.out.println("ȡ��ɹ���ȡ��"+mon+"Ԫ"+"�����"+number+"Ԫ");
		}
		notifyAll();
	}
	//��Ǯ
	public void cun(int mon){
		number= number+mon; //������������
		System.out.println("���ɹ������"+mon+"Ԫ"+"�����"+number+"Ԫ");
	}
	
	
	public int getMondy() {
		return number;
	}
	public void setMondy(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
