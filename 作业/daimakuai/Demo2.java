public class Demo2{
	{
		System.out.println("���ǹ������");
	}
	public Demo2(){
		System.out.println("���ǹ��췽��");
	}
	static{
		System.out.println("���Ǿ�̬�����");
	}
	public static void main (String [] args){
		System.out.println("Main");
		new Demo();
		new Demo();
	}
}