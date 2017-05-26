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
	//创建界面
	public KeHuDuan(Socket st){
		this.setLayout(null);
		this.setTitle("聊天");
		//文本域
		JTextArea ja = new JTextArea();
		ja.setBounds(0, 0, 800, 600);	
		this.add(ja);
		//历史消息
		try {
			//连接数据库
			Connection con =  ShuJuKu.getInstace();
			//创建Statement对象用来执行sql语句
			Statement statement = con.createStatement();
			String s = "select * from xiaoxi";
			//储存数据
			ResultSet rs = statement.executeQuery(s);
			while(rs.next()){
				//把数据库消息表中的数据返回到文本域
				ja.setText(rs.getString("xiaoxi")+"\n"+ja.getText());
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		//单行文本框
		JTextField jf = new JTextField();
		jf.setBounds(0,630,800,50);
		this.add(jf);
		//发送按钮
		JButton jb = new JButton();
		jb.setText("发送");
		jb.setBounds(650, 680,120, 50);
		this.add(jb);
		//事件委托机制    触发发送按钮
		jb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String neirong = jf.getText();
				if(!"".equals(neirong)){
					try {
						//读写出的内容
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
		//  清空消息按钮
		JButton jb2 = new JButton();
		jb2.setText("清空消息");
		jb2.setBounds(450, 680, 120, 50);
		this.add(jb2);
		//触发清空消息按钮
		jb2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ja.setText("");
			}});
		//启动客户端线程
		new Thread(new KeRunnable(st, ja)).start();
		
		this.setVisible(true);//透明度
		this.setBounds(100, 100, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口
	}
	public static void main(String[] args) {
		Socket st = null;
		try {
			st = new Socket("192.168.199.167",8889);
			//写出
			PrintWriter pw = new PrintWriter(st.getOutputStream());
			pw.write("小明\n");
			pw.flush();
			new KeHuDuan(st);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
