public class LocalInnerclass{
	String name = "will";
	public static void main(String [] args){
		new LocalInnerclass().show();
	}
	public void show(){
		final int num = 10;//final修饰局部变量
		class LocalClass{//局部内部类
			public void test(){
				System.out.println(name+"---->"+num);
			}
		}
		new LocalClass().test();//调用
	}
}