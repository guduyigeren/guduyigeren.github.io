package com.test;

import java.io.*;
import java.net.Socket;

public class KeHuDuan {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			System.out.println("��������");
			socket = new Socket("192.168.199.166",8961);
			String s = "hello";
			//��������˷�������
			System.out.println("���ӳɹ����������������������");
			OutputStream outputstream = socket.getOutputStream();
			outputstream.write(s.getBytes());
			outputstream.flush();
			socket.shutdownOutput();
			//���ܷ�����������������
			System.out.println("���ڽ��ܷ��������ص���Ϣ");
			InputStream inputstream = socket.getInputStream();
			int len = 0;
			byte[] bytes = new byte[1024];
			StringBuffer stringbuffer = new StringBuffer();
			while((len = inputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes,0,len));
			}
			System.out.println("�������˷�������Ϊ:"+stringbuffer);
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
						socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
