public class DianNao{
	public static void main(String [] args){
		DiannaoLei [] diannaoleis = new DiannaoLei[3];
		DiannaoLei diannaolei1 = new DiannaoLei("����","С��",4888,"����");
		diannaoleis[0] = diannaolei1;
		DiannaoLei diannaolei2 = new DiannaoLei("����","��ϻ",5888,"�ź�");
		diannaoleis[1] = diannaolei2;
		DiannaoLei diannaolei3 = new DiannaoLei("����","����",4999,"��ɫ");
		diannaoleis[2] = diannaolei3;
		for(int i=0;i<diannaoleis.length;i++){
			diannaoleis[i].dnl();
		}
	}
}