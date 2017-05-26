package com.dazhi;
import java.util.*;
public class Students {

	public static void main(String[] args) {
		Demo de = new Demo();
		TreeSet ts = new TreeSet(de);
		ts.add(new Student("张三",20,"男",88));
		ts.add(new Student("李四",19,"男",90));
		ts.add(new Student("王小二",20,"男",86));
		ts.add(new Student("盗跖",19,"男",99));
		Iterator itreator = ts.iterator();
		while(itreator.hasNext()){
			Student s = (Student) itreator.next();
			System.out.println(s.toString());
		}
	}
}
