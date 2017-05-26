import java.util.*;
public class Demo2{
	public static void main(String [] args){
		//定义Set集合
		Set<String> emp=new HashSet<String>();
		emp.add("Tom");
		emp.add("Mike");
		emp.add("Jack");
		emp.remove("Tom");
		emp.remove("Jack");
		emp.add("Linda");
		//对象数目为2，
		System.out.println(emp.size());
	}
}