import java.util.*;
public class A3{
	public static void main(String [] args){
		int [] arr1 ={1,2,3,4,5,6};
		int [] arr2 = Arrays.copyOf(arr1,3);
		System.out.println("arr1[]�����Ԫ��Ϊ");
		for(int i=0;i<arr1.length;i++){
			System.out.println(""+arr1[i]);
		}
		System.out.println("arr2[]�����Ԫ��Ϊ");
		for(int j=0;j<arr2.length;j++){
			System.out.println(""+arr2[j]);
		}
	}
}