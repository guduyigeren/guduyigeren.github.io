import java.util.*;
public class Student{
	private String name;
	private int age;
	public Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void show(){
		System.out.println(name+""+age);
	}
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student obj2=(Student)obj;
			return name.equals(obj2.name);
		}else{
			return false;
		}
	}
	public int hashCode(){
		return name.hashCode();
	}
	public static void main(String [] args){
		Set<Student>s=new HashSet<Student>();
		s.add(new Student("Tom",15));
		s.add(new Student("Mike",25));
		s.add(new Student("Tom",45));
		Iterator<Student>it=s.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			stu.show();
		}
	}
}