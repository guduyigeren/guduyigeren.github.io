package com.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

public class KeRunnable implements Runnable{
	Socket st;
	JTextArea ja;
	public KeRunnable(Socket st,JTextArea ja){
		this.st = st;
		this.ja = ja;
	}
	@Override
	public void run() {
		while(true){
			try {
				//����
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				//ֻ��һ��
				String neirong = brr.readLine();
				//�����ڵ����ݺ���ǰ������һ�𷵻ص��ı���
				ja.setText(ja.getText()+"\n"+neirong);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
