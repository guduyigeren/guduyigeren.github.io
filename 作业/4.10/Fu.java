public class Fu{
    private String name;
    private String sex;
    public Fu(String name,String sex){
        this.name = name;
        this.sex = sex;
    }
    public void fangfa(){
        System.out.println("我是"+name+"性别"+sex);
    }
}
/*public class Zi extends Fu{
    super(name,sex);
    public void fangfa(){
        System.out.println("大家好！");
        super.fangfa();
    }
}
public class Demo{
    public static void main(String [] args){
        Zi zi = new Zi("小明","男");
        zi.fangfa();
    }
}*/