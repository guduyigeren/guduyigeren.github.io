package com.test;

import java.io.*;

import java.net.ServerSocket;
import java.net.Socket;

public class FuWuDuan {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			//���������
			serversocket = new ServerSocket(8961);
			System.out.println("�����ɹ�");
			socket = serversocket.accept();//���ؿͻ���
			System.out.println("���ӳɹ����ڶ�ȡ����");
			
			//���ܿͻ��˷�������Ϣ
			InputStream inputstream = socket.getInputStream();
			int len = 0;
			byte[] bytes = new byte[1024];
			StringBuffer stringbuffer = new StringBuffer();
			while((len = inputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes,0,len));
				len=0;
			}
			System.out.println("�ͻ��˷�������Ϣ��"+stringbuffer);
			String s = "���յ���Ϣ��"+stringbuffer.toString();
			
			//�����ݷ��͵��ͻ���
			System.out.println("������ͻ��˷�����Ϣ");
			OutputStream outputstream = socket.getOutputStream();
			outputstream.write(s.getBytes());
			outputstream.flush();
			outputstream.close();//�ر������
			inputstream.close();//�ر�������
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//�رտͻ���
			System.out.println("�ر�����");
			if(socket!=null){
				if(socket.isConnected()){
					try {
						//socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
			//�رշ����
			if(serversocket!=null){
				if(!serversocket.isClosed()){
					try {
						//serversocket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
