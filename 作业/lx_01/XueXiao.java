public class XueXiao{
	public static void main(String [] args){
		School [] schools = new School[2];
		School school1 = new School("山东交通技术学院","滨河大道","1000/平米",500,8000);
		schools[0] = school1;
		School school2 = new School("鲁南技师学院","滨河大道","850/平米",300,7000);
		schools[1] = school2;
		for(int i=0;i<schools.length;i++){
			schools[i].shl();
		}
	}
}