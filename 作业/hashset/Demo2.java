import java.util.*;
public class Demo2{
	public static void main(String [] args){
		//����Set����
		Set<String> emp=new HashSet<String>();
		emp.add("Tom");
		emp.add("Mike");
		emp.add("Jack");
		emp.remove("Tom");
		emp.remove("Jack");
		emp.add("Linda");
		//������ĿΪ2��
		System.out.println(emp.size());
	}
}