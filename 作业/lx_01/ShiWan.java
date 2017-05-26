public class ShiWan{
	public static void main(String [] args){
		int a,b;
		b=0;
		for(a=1;a<=100000;a++){
			b=a+b;
		}
		System.out.println("100000的以内的和是"+b);
	}
}