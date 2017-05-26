package com.tesst;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class HttpDemo {
	
	private ServerSocket sst = null;
	
	public HttpDemo(){
		try {
			sst = new ServerSocket(8086);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(true){
			try {
				Socket st = sst.accept();
				byte [] bytes = new byte[1024];
				BufferedReader brr = new BufferedReader(new InputStreamReader(st.getInputStream()));
				String s = brr.readLine();
				String[] ss = s.split(" ");
				String[] sss = ss[1].split("[?]");
				String[] ssss = sss[1].split("&");
				if(ssss[1].equals("action=delete")){
					String sql = "delete from student where"+ssss[0];
				}
				FileInputStream fism = new FileInputStream(new File("src"+ss[1]));
				PrintStream psm = new PrintStream(st.getOutputStream());
				psm.println("HTTP/1.1 200 OK");
				psm.println("Content-Type:text.html");
				byte[] buf1 = new byte[fism.available()];
                //读取文件内容到buf1数组当中。
                fism.read(buf1);
                //写入到输出流当中。
                psm.write("123".getBytes());
                psm.flush();
                psm.close();
                //in.close();
                st.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {

	}

}
