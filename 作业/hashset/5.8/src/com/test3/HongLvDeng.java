package com.test3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HongLvDeng extends JFrame {
	boolean flag = true;
	public HongLvDeng(){
		this.setLayout(null);
		//信号灯
		JButton jb = new JButton();
		jb.setBounds(205,150,70,25);
		jb.setText("开始");
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
								jl.setText("红灯，停");
								jb2.setBackground(Color.red);
								Thread.sleep(5000);
								
								jl.setText("黄灯，等一等");
								jb2.setBackground(Color.yellow);
								Thread.sleep(2000);
								
								jl.setText("绿灯，行");
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
