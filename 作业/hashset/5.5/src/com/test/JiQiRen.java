package com.test;

import java.io.*;

import java.net.*;

public class JiQiRen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "http://www.tuling123.com/openapi/api?key=4cd1c001246a4246a99392dbb25dff70&info=你好";
		try {
			URL url = new URL(s);
			URLConnection unn= url.openConnection();
			unn.connect();
			BufferedReader brr = new BufferedReader(new InputStreamReader(unn.getInputStream()));
			StringBuffer sb = new StringBuffer();
			System.out.println(brr.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
