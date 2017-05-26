package com.dazhi;

import java.util.Comparator;

public class Demo implements Comparator{

	public int compare(Object o1, Object o2) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			if(s1.getAge()>s2.getAge()){
				return 1;
			}
			else if(s1.getAge()<s2.getAge()){
				return -1;
			}
			else if(s1.getAge()==s2.getAge()){
				if(s1.getGrade()>s2.getGrade()){
					return -1;
				}
				else if(s1.getGrade()<s2.getGrade()){
					return 1;
				}
				return 1;
			}
		return 0;		
	}
}
