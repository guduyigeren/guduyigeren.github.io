class Outer{
	private String name = "will";
	private static int age = 17;

	static class StaticInner{
		private String s = "ooxx";
		private static int num = 13;

		public void show(){
			//System.out.println(name);//不能访问
			System.out.println(age);//可以访问
			System.out.println(new Outer().name);
		}
	}
	public void test(){
		//System.out.println(s);//访问不到
		//System.out.println(num);//访问不到
		System.out.println(StaticInner.num);//可以访问
		System.out.println(new StaticInner().s);//可以访问
		new StaticInner().show();//创建内部类对象并调用内部类方法show
	}
}

public class StaticInnerClassDemo2{
	public static void main(String [] args){
		new Outer().test();
	}
}