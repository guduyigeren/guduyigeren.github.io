package com.test3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HongLvDeng extends JFrame {
	boolean flag = true;
	public HongLvDeng(){
		this.setLayout(null);
		//�źŵ�
		JButton jb = new JButton();
		jb.setBounds(205,150,70,25);
		jb.setText("��ʼ");
		this.add(jb);
		JButton jb2 = new JButton();
		jb2.setBounds(200,200,80,80);
		this.add(jb2);
		JLabel jl = new JLabel();
		jl.setText("");
		jl.setBounds(200,300,150,25);
		this.add(jl);
		JLabel jl2 = new JLabel();
		jl2.setBounds(180,400,50,25);
		jl2.setText("");
		this.add(jl2);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Thread(new Runnable(){
					public void run(){
						while(flag){
							try {
								jl.setText("��ƣ�ͣ");
								jb2.setBackground(Color.red);
								Thread.sleep(5000);
								
								jl.setText("�Ƶƣ���һ��");
								jb2.setBackground(Color.yellow);
								Thread.sleep(2000);
								
								jl.setText("�̵ƣ���");
								jb2.setBackground(Color.green);
								Thread.sleep(5000);

							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}).start();
			}
		});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,500,600);
		this.setVisible(true);
	}
	public static void main(String[] args){
		 new HongLvDeng();
	 }
}
