public class shuixianhuashu{
	public static void main(String args []){
		int a,b,c,d;
		for(a=100;a<1000;a++){
			b=a/100;
			c=a/10%10;
			d=a%10;
			if(b*b*b+c*c*c+d*d*d==a)
			System.out.println("水仙花数是"+a);
		}
	}
}