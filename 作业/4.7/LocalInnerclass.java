public class LocalInnerclass{
	String name = "will";
	public static void main(String [] args){
		new LocalInnerclass().show();
	}
	public void show(){
		final int num = 10;//final���ξֲ�����
		class LocalClass{//�ֲ��ڲ���
			public void test(){
				System.out.println(name+"---->"+num);
			}
		}
		new LocalClass().test();//����
	}
}