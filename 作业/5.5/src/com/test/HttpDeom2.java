package com.test;

import java.io.*;
import java.net.*;

public class HttpDeom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		
		try {
			//创建url
			URL url = new URL(s);
			//连接url
			URLConnection unn = url.openConnection();
			//发起请求
			unn.connect();
			//获取内容
			//BufferedReader brr = new BufferedReader(new InputStreamReader(unn.getInputStream()));
			//StringBuffer sb = new StringBuffer();
			//System.out.println(brr.readLine());
			InputStream ism = unn.getInputStream();
			byte[] bytes = new byte[1024];
			int len;
			File file = new File("src/com/test/1.jpg");
			FileOutputStream fosm = new FileOutputStream(file);
			while((len=ism.read(bytes))!=-1){
				fosm.write(bytes,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
