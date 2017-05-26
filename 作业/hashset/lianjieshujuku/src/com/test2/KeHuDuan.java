package com.test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.sql.*;
public class KeHuDuan extends JFrame{
	//��������
	public KeHuDuan(Socket st){
		this.setLayout(null);
		this.setTitle("����");
		//�ı���
		JTextArea ja = new JTextArea();
		ja.setBounds(0, 0, 800, 600);	
		this.add(ja);
		//��ʷ��Ϣ
		try {
			//�������ݿ�
			Connection con =  ShuJuKu.getInstace();
			//����Statement��������ִ��sql���
			Statement statement = con.createStatement();
			String s = "select * from xiaoxi";
			//��������
			ResultSet rs = statement.executeQuery(s);
			while(rs.next()){
				//�����ݿ���Ϣ���е����ݷ��ص��ı���
				ja.setText(rs.getString("xiaoxi")+"\n"+ja.getText());
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		//�����ı���
		JTextField jf = new JTextField();
		jf.setBounds(0,630,800,50);
		this.add(jf);
		//���Ͱ�ť
		JButton jb = new JButton();
		jb.setText("����");
		jb.setBounds(650, 680,120, 50);
		this.add(jb);
		//�¼�ί�л���    �������Ͱ�ť
		jb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String neirong = jf.getText();
				if(!"".equals(neirong)){
					try {
						//��д��������
						PrintWriter pw = new PrintWriter(st.getOutputStream());
						pw.write(neirong+"\n");
						pw.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				jf.setText("");
			}
		});
		//  �����Ϣ��ť
		JButton jb2 = new JButton();
		jb2.setText("�����Ϣ");
		jb2.setBounds(450, 680, 120, 50);
		this.add(jb2);
		//���������Ϣ��ť
		jb2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ja.setText("");
			}});
		//�����ͻ����߳�
		new Thread(new KeRunnable(st, ja)).start();
		
		this.setVisible(true);//͸����
		this.setBounds(100, 100, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
	}
	public static void main(String[] args) {
		Socket st = null;
		try {
			st = new Socket("192.168.199.167",8889);
			//д��
			PrintWriter pw = new PrintWriter(st.getOutputStream());
			pw.write("С��\n");
			pw.flush();
			new KeHuDuan(st);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
