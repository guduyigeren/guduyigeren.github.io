package com.test;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class HttpDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="http://www.baidu.com";
		try{
			//����url����
			URL url1 = new URL(url);
			//��url
			URLConnection unn = url1.openConnection();
			//��������
			unn.connect();
			//��÷�������
			//unn.getInputStream();
			BufferedReader brr = new BufferedReader(
					new InputStreamReader(
							unn.getInputStream()));
			StringBuffer sb = new StringBuffer(); 
			
			System.out.println(brr.readLine());
			System.out.println(brr.readLine());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
