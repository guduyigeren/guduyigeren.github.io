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
				//读入
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				//只读一行
				String neirong = brr.readLine();
				//把现在的内容和以前的内容一起返回到文本域
				ja.setText(ja.getText()+"\n"+neirong);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
