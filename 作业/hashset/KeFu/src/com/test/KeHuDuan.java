package com.test;
import java.io.IOException;
import java.net.*;
public class KeHuDuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����˿�
		try{
			ServerSocket ssr = new ServerSocket(1456);
			System.out.println("�������˴����ɹ�");
			//�����˿�
			Socket skt = ssr.accept();
			System.out.println("���ڼ����˿�");
			//����ip��ַ
			String address = skt.getLocalAddress().getHostAddress();
			System.out.println("���������ʵĵ�ַ"+address);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
