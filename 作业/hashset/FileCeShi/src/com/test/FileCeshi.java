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
		//��������ļ�������
		System.out.println("name�ǣ�"+file.getName());
		//��������ļ��ľ���·��
		System.out.println("path="+file.getAbsolutePath());
		//��������ļ������·��
		System.out.println("name="+file.getPath());
		//������·������һ��Ŀ¼
		System.out.println("parent="+file.getParent());
		//����ļ����ݵĳ���
		System.out.println("length="+file.length());
		/*�ж��ļ���Ŀ¼�Ƿ����
		 * if(file.exists()){
			file.delete();//ɾ�������ı�
		}*/
		File file = new File("src/com/test/java.txt");
		
		//list�ҵ��ļ�
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
	//�ݹ鷽��
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
