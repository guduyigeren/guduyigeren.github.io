class Outer{
	private String name = "will";
	private static int age = 17;

	static class StaticInner{
		private String s = "ooxx";
		private static int num = 13;

		public void show(){
			//System.out.println(name);//���ܷ���
			System.out.println(age);//���Է���
			System.out.println(new Outer().name);
		}
	}
	public void test(){
		//System.out.println(s);//���ʲ���
		//System.out.println(num);//���ʲ���
		System.out.println(StaticInner.num);//���Է���
		System.out.println(new StaticInner().s);//���Է���
		new StaticInner().show();//�����ڲ�����󲢵����ڲ��෽��show
	}
}

public class StaticInnerClassDemo2{
	public static void main(String [] args){
		new Outer().test();
	}
}