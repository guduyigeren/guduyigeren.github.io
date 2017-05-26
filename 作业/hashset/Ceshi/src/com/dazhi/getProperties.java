package com.dazhi;
import java.util.*;
import java.io.*;
public class getProperties {

	public static void main(String[] args)throws FileNotFoundException,IOException{
		Properties pps = new Properties();
		pps.load(new FileInputStream("src/com/dazhi/Test.properties"));
		Enumeration enum1 = pps.propertyNames();
		while(enum1.hasMoreElements()){
			String strKey = (String)enum1.nextElement();
			String strValue = pps.getProperty(strKey);
			System.out.println(strKey+"="+strValue);
		}

	}

}
