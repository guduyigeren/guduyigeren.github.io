import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class JieShou implements Runnable{
	//����socket
	Socket st;
	//����JTextArea
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
				
				//���ܷ�������
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String neirong = brr.readLine();//���������ص�����
				//��ʾJTextArea
				ja.setText(ja.getText()+"\n"+neirong);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
