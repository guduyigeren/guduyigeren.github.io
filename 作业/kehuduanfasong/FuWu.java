import java.io.*;
import java.net.*;

public class FuWu {

	public static void main(String[] args) {
		ServerSocket sst = null;
		Socket st = null;
		try {
			sst = new ServerSocket(8828);
			st = sst.accept();
			ObjectInputStream oism = new ObjectInputStream(st.getInputStream());
			Student s = (Student)oism.readObject();
			System.out.println("客户端发来对象"+s);
			ObjectOutputStream oosm = new ObjectOutputStream(st.getOutputStream());
			oosm.writeObject(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}