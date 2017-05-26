public class XueSheng{
	public static void main(String [] args){
		/*Student Student1 = new Student();
		Student1.name = "张三";
		System.out.print(""+Student1.name+"在");
		Student1.chi();*/
		Student [] students = new Student [4];
		Student student1 = new Student("张三",20,'男');
		students[0] = student1;
		Student student2 = new Student("李四",15,'男');
		students[1] = student2;
		Student student3 = new Student("王五",18,'男');
		students[2] = student3;
		Student student4 = new Student("李丽",18,'女');
		students[3] = student4;
		for(Student s:students){
			s.sac();
		}
		//Student student1= new Student();
	}
}