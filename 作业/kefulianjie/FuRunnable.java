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
			try{//��
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String xiaoxi = null;
				xiaoxi = brr.readLine();
				//������˭���͵�  ����
				Set<String> keys = shm.keySet();
				String name = "";
				for(String s:keys){
					Socket so = shm.get(s);
					if(st==so){
						name = s;
					}
				}
				System.out.println("�ͻ��˷�������Ϊ"+xiaoxi);
				//��
				String s = name+"˵"+xiaoxi;
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