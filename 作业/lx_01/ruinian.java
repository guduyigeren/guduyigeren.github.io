public class ruinian{
	public static void main(String args[]){
		int a;
		for(a=2000;a<2500;a++){
			if((a%4==0 && a%100!=0)||a%400==0){
			System.out.println("ÈòÄêÓÐ"+a);
			}
		}
	}
}