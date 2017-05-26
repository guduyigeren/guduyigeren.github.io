public class JiShuHe{
	public static void main(String [] args){
		int a,b,c=0;
		for(a=100;a<=200;a++){
			b=2;
			if(a%b!=0){
				System.out.println(""+a);
				c=a+c;
			}
		}
		System.out.println(""+c);
	}
}