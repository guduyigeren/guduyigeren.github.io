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
	//存货
	public synchronized void push(int number){
		if(getSize()+number<=Max){
			setSize(getSize()+number);//得到存货加上现有的存货
			System.out.println("生产了"+number+"当前库存为"+getSize());
		}else{
			System.out.println("库存已满，暂停生产，等待消费");
			try {
				this.wait();//让获取该对象锁的线程处于等待状态
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//通知消费者消费
		notifyAll();
	}
	//取货
	public synchronized void pop(int number){
		//判断是否缺货
		if(getSize()-number<0){
			try {
				this.wait();//等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("消费成功"+number+"个，当前库存为"+getSize());
		}
		notifyAll();
	}
}
