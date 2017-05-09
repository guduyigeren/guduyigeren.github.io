- 封装的含义

 - 1. 把对象的状态和行为看成一个统一的整体，将二者存放在一个类中。

 - 2. 隐藏信息，把不需要外界知道的信息隐藏起来。


- 例如：

```
    public class Student{
      //学生学号
      private int id;
      //学生姓名
      private String name;
      //学生年龄
      private int age;
      //学生性别
      private String sex;
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
    public class Students{
      public static void main(String [] args){
        Student student = new Student();
        student.setId("1");
        student.setName("xiaoming");
        student.setAge("20");
        student.setSex("nan");
        System.out.println(student.getId()+""+student.getName()+""+student.getAge()+""+student.getSex());
      }
    }
```
  以上代码可以初步体现出封装的例子，这里面用到了this关键字、private修饰符、get()和set()方法。
  
  
- this关键字:
         -特点：this表示当前对象。

         当前对象 ←→   当前正在调用的实例成员的对象

     -换句话说：谁调用了方法，谁就是当前对象。

     -this关键字的使用:

         this.字段

     -注:this不能用在static修饰的方法里和static修饰的代码块里。

-  访问修饰符:
   
    修饰符:private(私有的)、default（默认）、protected（受保护的）、public（公共的）。

    访问权限:

    -private:本类内部可以访问，不能继承子类。

    -default:本类内部可以访问，同包其他类可以访问，同包可继承。

    -protected:本类内部可以访问，不同包的子类可以访问，同包其他类也可以访问，能继承到子类。

    -public:任何地方都可以访问，能继承到子类  

 
-  get()方法和set()方法:
    
    get()方法是给私有成员变量取值。

    set()方法是赋值。

在上面的例子中，我们对Student类进行了简单的封装，首先我们切断了外部直接调用id、name、age、sex的可能，可以通过get()和set()访问和修改id、name、age、sex。这样做的好处在于我们只需要修改内部的实现，而外部咋不需要去修改。
 
 