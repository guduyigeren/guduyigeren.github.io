//�����ε�����ܳ�
class Sanjiao extends MianjiZhouchang{
	int a = 5;
	int b = 5;
	int c = 5;
	double sum = 0;
	public void Zhouchang(){
		sum=a+b+c;
		System.out.println("�����ܳ�"+sum);
	}
	public void Mianji(){
		sum=a*b/2;
		System.out.println("�������"+sum);
	}
}