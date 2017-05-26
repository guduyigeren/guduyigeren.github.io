package com.dazhi;
import java.util.*;
public class CaiQuan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("----猜拳小游戏----");
			System.out.println("1.剪刀,2.石头,3,布");
			int a = sc.nextInt();  //接收输入的数
			int b = (int)(Math.random()*3)+1;  //电脑随机产生的数
			String yonghu = null;  //用户的手势
			String diannao = null;	//电脑的手势
			switch(a){
				case 1:yonghu = "剪刀";
				break;
				case 2:yonghu = "石头";
				break;
				case 3:yonghu = "布";
			}
			switch(b){
				case 1:diannao = "剪刀";
				break;
				case 2:diannao = "石头";
				break;
				case 3:diannao = "布";
			}
			//判断是否平局
			if(a==1&&b==1||a==2&&b==2||a==3&&b==3){
				System.out.println("你出的是"+a+"电脑出的是"+b);
				System.out.println("平局");
			}
			//判断是否赢
			if(a==1&&b==3||a==2&&b==1||a==3&&b==20){
				System.out.println("你出的是"+a+"电脑出的是"+b);
				System.out.println("恭喜你赢了");
			}
			//判断是否输
			if(a==1&&b==2||a==2&&b==3||a==3&&b==1){
				System.out.println("你出的是"+a+"电脑出的是"+b);
				System.out.println("你输了");
			}
		}
	}	
}
