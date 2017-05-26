import java.util.*;
public class MaoPao{
	public static void main(String [] args){
		int [] a = new int [5];
		int i,j,t;
		Scanner s = new Scanner(System.in);
		System.out.println("请输入五个数");
		for(i=0;i<5;i++){
			a[i] = s.nextInt(); 
		}
		for(j=0;j<4;j++){
			for(i=0;i<4-j;i++){
				if(a[i]>a[i+1]){
					t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;

				}
			}
		}
		for(i=0;i<5;i++){
			System.out.println(""+a[i]);
		}
	}
}