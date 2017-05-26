import java.util.*;
public class A2{
	public static void main(String [] agrs){
		int [] a ={1,8,7,5,3,9};
		Arrays.sort(a);
		for(int i=0;i<6;i++){
			System.out.println(a[i]);
		}
		
		int b = Arrays.binarySearch(a,5);
		System.out.println("Ë÷Òý"+b);
		int [] s = Arrays.copyOfRange();
	}
}