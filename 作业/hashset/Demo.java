import java.util.*;
public class Demo{
	public static void main(String [] args){
		Set<String> set=new HashSet<String>();
		String s1=new String("Hello");//���ñ���1
		String s2=new String("Hello");//���ñ���2
		String s3=new String("World");//���ñ���3
		set.add(s1);//��ӱ���s1
		set.add(s2);//��ӱ���s2
		set.add(s3);//��ӱ���s3
		//���������ĿΪ2��s1��s2�����ظ���Set��û���ظ��Ķ���������Ŀ��2
		System.out.println(set.size());
	}
}