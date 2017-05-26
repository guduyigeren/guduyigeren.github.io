import java.io.*;
public class OutputStreamDemo2{
	public static void main(String [] args) throws Exception{
		//异常抛出，不处理
		//第一步使用File类找到一个文件
		File f = new File("e:"+File.separator+"text.txt");//声明File对象
		//第二步、通过子类实例化父类对象
		OutputStream out = null; //准备好输出对象
		out = new FileOutputStream(f,true);//表示在文件末尾追加能容
		//第三步、写操作
		String str = "Hello World！";//准备字符串
		byte b [] = str.getBytes();//只能输出byte数组，所以将字符串变成byte数组
		for(int i=0;i<b.length;i++){
			//循环写入
			out.write(b[i]);//每次只写入一个内容
		}
		//4.关闭数据流
		out.close();
	}
}