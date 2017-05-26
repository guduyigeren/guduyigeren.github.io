import java.util.*;
public class Deom{
	int [] shuzu = new int[5];
	Scanner as = new Scanner(System.in);
	public static void main(String [] args){
		Deom d = new Deom();
		d.A();
	}
	public void A(){
		System.out.println("请输入5个整数");
		try{
			for(int i = 0;i<shuzu.length;i++){
				shuzu[i] = as.nextInt();
			}
		}catch(InputMismatchException in){
				System.out.println("请输入整数");
		}
	}	
}