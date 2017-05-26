import java.io.*;
public class InputStreamDemo2{
	public static void main(String [] args) throws Exception{
		//异常抛出，不处理
		//第一步使用File类找到一个文件
		File f = new File("e:"+File.separator+"text.txt");//声明File对象
		//第二步、通过子类实例化父类对象
		InputStream input = null; //准备好输出对象
		input = new FileInputStream(f);//通过对象的多态性进行实例化对象
		//第三步、写操作
		
		byte b [] = new byte[1024];//所有内容都读到byte数组中;
		int len = input.read(b);//读取内容
		//4.关闭数据流
		input.close();
		System.out.println("读出数据长度："+len);
		System.out.println("内容为："+new String(b,0,len));
		//把byte数字变成字符串输出
	}
}