import java.io.*;
import java.net.*;
import java.util.*;
public class FuRunnable implements Runnable{
	Socket st = null;
	List<Socket> sts;
	HashMap<String,Socket> shm = new HashMap<String,Socket>();
	public FuRunnable(Socket st,List<Socket> sts,HashMap<String,Socket> shm){
		this.st = st;
		this.sts = sts;
		this.shm = shm;
	}
	public void run(){
		while(true){
			try{//收
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String xiaoxi = null;
				xiaoxi = brr.readLine();
				//查找是谁发送的  遍历
				Set<String> keys = shm.keySet();
				String name = "";
				for(String s:keys){
					Socket so = shm.get(s);
					if(st==so){
						name = s;
					}
				}
				System.out.println("客户端返回内容为"+xiaoxi);
				//发
				String s = name+"说"+xiaoxi;
				for(Socket skt:sts){
					PrintWriter pwr = new PrintWriter(skt.getOutputStream());
					pwr.write(s+"\n");
					pwr.flush();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}