package com.test;
import java.io.*;

import com.sun.org.apache.xpath.internal.operations.Equals;
public class FileCeshi {

	public static void main(String[] args) {
	/*	File file = new File("src/com/test/java.txt");
		try{
			file.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
		//输出创建文件的名称
		System.out.println("name是："+file.getName());
		//输出创建文件的绝对路径
		System.out.println("path="+file.getAbsolutePath());
		//输出创建文件的相对路径
		System.out.println("name="+file.getPath());
		//输出相对路径的上一级目录
		System.out.println("parent="+file.getParent());
		//输出文件内容的长度
		System.out.println("length="+file.length());
		/*判断文件或目录是否存在
		 * if(file.exists()){
			file.delete();//删除创建文本
		}*/
		File file = new File("src/com/test/java.txt");
		
		//list找到文件
		//String[] strings = file.list();
		//for(String s:strings){
			//if(file.getName().endsWith(".java")){
			//	System.out.println(s);
			//}
			//System.out.println(s);
		//}
		//File[] strings = file.listFiles();
			//findFile(file);
		
		try{
			//FileReader fileReader = new FileReader(file);
			//int a = fileReader.read();
			//char [] chars = new char[(int)file.length()];
			//fileReader.read(chars);
			//for(char c:chars){
			//	System.out.println(c);
			//}
			//System.out.println(a);
			FileWriter filewriter = new FileWriter(file);
			String s ="Hello word";
			filewriter.write(s,0,s.length());
			filewriter.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	//递归方法
	public static void findFile(File f){
		if(f.isDirectory()){
			File[] files = f.listFiles();
			for(File f1:files){
				if(f1.getName().endsWith(".java")){
					findFile(f1);
				}
				
			}
		}else{
			System.out.println("path="+f.getAbsolutePath());
		}
	}
	
}
