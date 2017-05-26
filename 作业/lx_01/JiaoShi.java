public class JiaoShi{
	public static void main(String [] args){
		Teacher[] teachers = new Teacher[3];
		Teacher teacher1 = new Teacher("李四",24,'男',"体育",2000);
		teachers[0] = teacher1;
		Teacher teacher2 = new Teacher("王小二",22,'男',"数学",3000);
		teachers[1] = teacher2;
		Teacher teacher3 = new Teacher("李丽",25,'女',"语文",3000);
		teachers[2] = teacher3;
		for(int i=0;i<teachers.length;i++){
			teachers[i].tcr();
		}
	}
}