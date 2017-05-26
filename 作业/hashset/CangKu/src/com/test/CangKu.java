package com.test;

public class CangKu {
	private final static int Max = 100;
	private int size = 100;
	
	public  CangKu(int size){
		this.size = size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	//���
	public synchronized void push(int number){
		if(getSize()+number<=Max){
			setSize(getSize()+number);//�õ�����������еĴ��
			System.out.println("������"+number+"��ǰ���Ϊ"+getSize());
		}else{
			System.out.println("�����������ͣ�������ȴ�����");
			try {
				this.wait();//�û�ȡ�ö��������̴߳��ڵȴ�״̬
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//֪ͨ����������
		notifyAll();
	}
	//ȡ��
	public synchronized void pop(int number){
		//�ж��Ƿ�ȱ��
		if(getSize()-number<0){
			try {
				this.wait();//�ȴ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("���ѳɹ�"+number+"������ǰ���Ϊ"+getSize());
		}
		notifyAll();
	}
}
