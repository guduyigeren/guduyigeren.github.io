package com.test;

public class ChuangKou{
	//private static int piaoshu = 50;
	private String name;
	private Piao piao = new Piao("临沂到上海",50);
	public synchronized void FangFa(){
		int a=0,b=0,c=0;
		while(true){
			int as = piao.getNumber();
			as--;
			piao.setNumber(as);
			if(as<1){
				System.out.println("票以售空");
				break;
			}
			System.out.println(name+"卖出了第"+as+"张票");
			if(getName().equals("窗口一")){
				a++;
				System.out.println("窗口一出售"+a+"张");
			}
			if(getName().equals("窗口二")){
				b++;
			}
			if(getName().equals("窗口三")){
				c++;
			}
		}
		
		//System.out.println("窗口一出售"+a+"张");
		System.out.println("窗口二出售"+b+"张");
		System.out.println("窗口三出售"+c+"张");
	}
	public ChuangKou(int piaoshu,String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
