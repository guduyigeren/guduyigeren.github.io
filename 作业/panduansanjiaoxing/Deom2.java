import java.util.*;
public class Deom2{
	Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		
			Deom2 d = new Deom2();
			try{
				d.sanjiao();		
			}catch(Exception e){
					e.printStackTrace();			
			}
		
	}
	public void sanjiao()throws Exception{
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个数");
			a = sc.nextInt();
			System.out.println("请输入第二个数");
			b = sc.nextInt();
			System.out.println("请输入第三个数");
			c = sc.nextInt();
			if(a+b>=c && a+c>=b && c+b>=a){
				System.out.println("a="+a+"b="+b+"c="+c);
			}else{
			throw new Exception("a="+a+"b="+b+"c="+c+"不能组成三角形");
			 }
	}
}