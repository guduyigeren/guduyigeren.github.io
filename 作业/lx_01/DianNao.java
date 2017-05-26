public class DianNao{
	public static void main(String [] args){
		DiannaoLei [] diannaoleis = new DiannaoLei[3];
		DiannaoLei diannaolei1 = new DiannaoLei("联想","小新",4888,"银白");
		diannaoleis[0] = diannaolei1;
		DiannaoLei diannaolei2 = new DiannaoLei("戴尔","游匣",5888,"炫黑");
		diannaoleis[1] = diannaolei2;
		DiannaoLei diannaolei3 = new DiannaoLei("炫龙","毒刺",4999,"黑色");
		diannaoleis[2] = diannaolei3;
		for(int i=0;i<diannaoleis.length;i++){
			diannaoleis[i].dnl();
		}
	}
}