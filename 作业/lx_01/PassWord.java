import java.util.*;
public class PassWord{
	public static void main(String [] args){
		System.out.println("请输入密码");
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("请输入6位到18位的密码");
			String p = s.next();
			if(p.length()>=6 && p.length()<=18){
				char[] w = p.toCharArray();
				int a = 0,b = 0, c = 0,sum=0;
				for(int i=0;i<w.length;i++){
					if((w[i]>='A' && w[i]<='Z') || (w[i]>='a' && w[i]<='z')){
						a=1;
				
					}
					else if(w[i]>=48 && w[i]<=57){
						b=1;
					//	break;
					}
					else{
						c=1;
						//break;
					}
					
				}
				sum=a+b+c;
					if(sum==1){
						System.out.println("弱");
					}
					if(sum==2){
						System.out.println("中等");
					}
					if(sum==3){
						System.out.println("强");
					}
			}
			else{
				System.out.println("长度不符，请重新输入");
			}
		}
	}
}