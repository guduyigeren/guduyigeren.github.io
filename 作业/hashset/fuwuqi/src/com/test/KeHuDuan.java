package com.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class KeHuDuan {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			//�����˿�
			serversocket = new  ServerSocket(9878);
			System.out.println("�������˿ڴ����ɹ�");
			while(true){
				//�����˿�
				socket = serversocket.accept();
				System.out.println("���ڼ����˿�");
				
				InputStream inputstream = socket.getInputStream();
				byte [] bytes = new byte[1024];
				int len = 0;
				StringBuffer stringbuffer = new StringBuffer();
				while((len = inputstream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("��������:���Ǹ����");
				System.out.println("�ͻ��ˣ�"+stringbuffer.toString());
				inputstream.close();
				//������ip��ַ
				String address = new String(socket.getInetAddress().getHostAddress());
				System.out.println("���������ʵ�ַ��"+address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
