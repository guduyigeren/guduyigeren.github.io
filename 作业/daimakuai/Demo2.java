public class Demo2{
	{
		System.out.println("我是构造代码");
	}
	public Demo2(){
		System.out.println("我是构造方法");
	}
	static{
		System.out.println("我是静态代码块");
	}
	public static void main (String [] args){
		System.out.println("Main");
		new Demo();
		new Demo();
	}
}