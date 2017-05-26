public class Xuesheng{
	String name;
	private int age;
	private char sex;
	public Xuesheng(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void xs(){
		System.out.println("姓名"+name+"年龄"+age+"岁"+"性别"+sex);
	}
	public void getage(int age){
		this.age = age;
	}
	public void getsex(char sex){
		this.sex = sex;	
	}
}
