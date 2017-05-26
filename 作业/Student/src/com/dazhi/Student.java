package com.dazhi;

public class Student implements Comparable{
	private String name;
	private int age;
	private String sex;
	private int grade;
	public Student(String name,int age,String sex,int grade){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.grade=grade;
	}
	public String toString(){
		return ("姓名:"+name+"\t年龄:"+age+"\t性别:"+sex+"\t成绩:"+grade);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		return 0;
	}
}
