public class Demo{
	{
		System.out.println("我是构造代码块");
	}
	public Demo(){
		System.out.println("我是构造方法");
	}
	public static void main(String [] args){
		Demo d1 = new Demo();
		Demo d2 = new Demo();
	}
}