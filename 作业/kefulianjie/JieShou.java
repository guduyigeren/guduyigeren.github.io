import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class JieShou implements Runnable{
	//传入socket
	Socket st;
	//传入JTextArea
	JTextArea ja;
	public JieShou(Socket st,JTextArea ja){
		this.st = st;
		this.ja = ja;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				
				//接受返回内容
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String neirong = brr.readLine();//服务器返回的内容
				//显示JTextArea
				ja.setText(ja.getText()+"\n"+neirong);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
