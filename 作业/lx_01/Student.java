public class Student{
	//声明学生信息
	String name; //姓名
	int age; //年龄
	char sex;	//性别

	//声明学生动作信息
	public void chi(){
		System.out.println("吃饭");
	}
	public void wan(){
		System.out.println("玩游戏");
	}
	public void xue(){
		System.out.println("学习");
	}
	public Student(){
		System.out.println("让坑了");
	}

	public Student(String name, int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void sac(){
		System.out.println("姓名:"+name+"\t年龄:"+age+"岁"+"\t性别:"+sex);
	}
}