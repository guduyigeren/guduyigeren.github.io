import java.io.*;
import java.net.*;
import java.util.*;

public class KeHu {

	public static void main(String[] args) {
		Socket socket = null;
		//Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("192.168.137.1",8828);
			OutputStream osm = socket.getOutputStream();
			ObjectOutputStream oosm = new ObjectOutputStream(osm);
			oosm.writeObject(new Student("¸ßöÎ",20));
			
			ObjectInputStream oism = new ObjectInputStream(socket.getInputStream());
			Student s =(Student) oism.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
