import java.io.*;
public class InputStreamDemo4{
	public static void main(String [] args) throws Exception{
		//异常抛出，不处理
		//第一步使用File类找到一个文件
		File f = new File("e:"+File.separator+"text.txt");//声明File对象
		//第二步、通过子类实例化父类对象
		InputStream input = null; //准备好输出对象
		input = new FileInputStream(f);//通过对象的多态性进行实例化对象
		//第三步、写操作
		
		byte b [] = new byte[1024];//所有内容都读到byte数组中;
		int len = 0;
		int temp = 0;//接受每一个读取进来的数据
		while((temp=input.read())!=-1){
			//表示还有内容文件没有读完
			b[len] = (byte)temp;
			len++;
		}
		//4.关闭数据流
		input.close();
		System.out.println("读出数据长度："+len);
		System.out.println("内容为："+new String(b,0,len));
		//把byte数字变成字符串输出
	}
}