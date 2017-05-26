import java.util.*;
public class Demo{
	public static void main(String [] args){
		Set<String> set=new HashSet<String>();
		String s1=new String("Hello");//引用变量1
		String s2=new String("Hello");//引用变量2
		String s3=new String("World");//引用变量3
		set.add(s1);//添加变量s1
		set.add(s2);//添加变量s2
		set.add(s3);//添加变量s3
		//输出对象数目为2，s1和s2变量重复，Set中没有重复的对象所以数目是2
		System.out.println(set.size());
	}
}