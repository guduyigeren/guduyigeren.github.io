package com.test;

public class ChuangKou{
	//private static int piaoshu = 50;
	private String name;
	private Piao piao = new Piao("���ʵ��Ϻ�",50);
	public synchronized void FangFa(){
		int a=0,b=0,c=0;
		while(true){
			int as = piao.getNumber();
			as--;
			piao.setNumber(as);
			if(as<1){
				System.out.println("Ʊ���ۿ�");
				break;
			}
			System.out.println(name+"�����˵�"+as+"��Ʊ");
			if(getName().equals("����һ")){
				a++;
				System.out.println("����һ����"+a+"��");
			}
			if(getName().equals("���ڶ�")){
				b++;
			}
			if(getName().equals("������")){
				c++;
			}
		}
		
		//System.out.println("����һ����"+a+"��");
		System.out.println("���ڶ�����"+b+"��");
		System.out.println("����������"+c+"��");
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
