public class Student{
      //学生学号
      private int id;
      //学生姓名
      private String name;
      //学生年龄
      private int age;
      //学生性别
      private String sex;
	public FangFa(){
		this.id=id;
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void ShuChu(){
		System.out.println(id+name+age+sex)
	}
      //查看学号的get方法
      public int getId(){
        return id;
      }
      //修改学号的set方法
      public void setId(int id){
        this.id=id;
      }
      //查看学生姓名的get方法
      public String getName(){
        return name;
      }
      //修改学生姓名的set方法
      public void setName(String name){
        this.name=name;
      }
      //查看学生年龄的get方法
      public int getAge(){
        return age;
      }
      //修改学生年龄的set方法
      public void setAge(int age){
        this.age=age;
      }
      //查看学生性别的get方法
      public String getSex(){
        return sex;
      }
      //修改学生性别的set方法
      public void setSex(String sex){
        this.sex=sex;
      }
    }
