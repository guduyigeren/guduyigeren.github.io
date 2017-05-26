package com.test4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.io.*;
public class JieMian extends JFrame{
	public JieMian(Socket st){
		this.setLayout(null);
		this.setTitle("Ⱥ��");
		
		JTextArea ja = new JTextArea();
		ja.setBounds(0, 0, 400, 300);
		this.add(ja);
		
		JTextField jf = new JTextField();
		jf.setBounds(0, 320, 400, 30);
		this.add(jf);
		
		JButton jt = new JButton();
		jt.setText("����");
		jt.setBounds(320, 360, 60, 40);
		this.add(jt);
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String neirong = jf.getText();
				//�õ��û���������ݡ�
				if(!"".equals(neirong)){
					try {
						//�ҵ�scoket
						PrintWriter pw = new PrintWriter(st.getOutputStream());
						pw.write(neirong+"\n");
						pw.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					//���
					jf.setText("");
				}
			}
		});
		new Thread(new JieShou(st,ja)).start();;
		
		this.setBounds(200,200,500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Socket st = null;
		try {
			st = new Socket("192.168.199.167",8888);
			//���߷�������˭
			PrintWriter pw = new PrintWriter(st.getOutputStream());
			pw.write("С��\n");
			new JieMian(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
