import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
public class FuWu {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		//保存Socket
		List <Socket> list = new ArrayList<Socket>();
		HashMap<String,Socket> hm = new HashMap<String,Socket>();
		try {
			serversocket = new ServerSocket(8858);
			
			while(true){
				//接收名字
				socket = serversocket.accept();
				BufferedReader brr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String name = brr.readLine();
				System.out.println(name);
				hm.put(name,socket);

				list.add(socket);
				
				new Thread(new FuRunnable(socket,list,hm)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}