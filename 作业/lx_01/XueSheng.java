public class XueSheng{
	public static void main(String [] args){
		/*Student Student1 = new Student();
		Student1.name = "����";
		System.out.print(""+Student1.name+"��");
		Student1.chi();*/
		Student [] students = new Student [4];
		Student student1 = new Student("����",20,'��');
		students[0] = student1;
		Student student2 = new Student("����",15,'��');
		students[1] = student2;
		Student student3 = new Student("����",18,'��');
		students[2] = student3;
		Student student4 = new Student("����",18,'Ů');
		students[3] = student4;
		for(Student s:students){
			s.sac();
		}
		//Student student1= new Student();
	}
}