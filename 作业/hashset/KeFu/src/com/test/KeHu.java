package com.test;
import java.io.*;
import java.net.*;
public class KeHu {

	public static void main(String[] args) {
		try {
			//���Ӷ˿�
			Socket skt = new Socket("192.168.199.166",1456);
			
			System.out.println("�Ƿ����ӳɹ�"+skt.isConnected());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
