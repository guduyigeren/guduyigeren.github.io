package com.dazhi;
import java.util.*;
public class Students {

	public static void main(String[] args) {
		Demo de = new Demo();
		TreeSet ts = new TreeSet(de);
		ts.add(new Student("����",20,"��",88));
		ts.add(new Student("����",19,"��",90));
		ts.add(new Student("��С��",20,"��",86));
		ts.add(new Student("����",19,"��",99));
		Iterator itreator = ts.iterator();
		while(itreator.hasNext()){
			Student s = (Student) itreator.next();
			System.out.println(s.toString());
		}
	}
}
