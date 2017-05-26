import java.io.*;
import java.net.*;
import java.util.*;
public class KeRunnable implements Runnable{
	Socket st = null;
	public KeRunnable(Socket st){
		this.st = st;
	}
	public void run(){
		
		while(true){
			Scanner sc = new Scanner(System.in);
			try{
				System.out.println("输入内容:");
				String neirong = sc.next();
				System.out.println("用户输入的内容是"+neirong);
				System.out.println("正在发送");
				//发
				PrintWriter pwr = new PrintWriter(st.getOutputStream());
				pwr.write(neirong+"\n");
				pwr.flush();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}