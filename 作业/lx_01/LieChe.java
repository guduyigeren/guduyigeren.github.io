public class LieChe{
	public static void main(String [] args){
		HuoCheLei [] huocheleis = new HuoCheLei[3];
		HuoCheLei huochelei1 = new HuoCheLei("������","����","400km/s");
		huocheleis[0] = huochelei1;
		HuoCheLei huochelei2 = new HuoCheLei("Զ����","����","200km/s");
		huocheleis[1] = huochelei2;
		HuoCheLei huochelei3 = new HuoCheLei("�ɻ���","�ؿ�","300km/s");
		huocheleis[2] = huochelei3;
		for(int i=0;i<huocheleis.length;i++){
			huocheleis[i].hcl();
		}
	}
}