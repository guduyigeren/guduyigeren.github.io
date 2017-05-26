package com.test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SuiJi extends JFrame{
	boolean flag = true;
	public SuiJi(){
		this.setLayout(null);
		this.setTitle("随机数");
		//随机数框
		JTextArea ja = new JTextArea();
		ja.setBounds(60,30,100,50);
		this.add(ja);
		//输入框
		JTextArea ja2 = new JTextArea();
		ja2.setBounds(220, 30, 100, 50);
		this.add(ja2);
		//开始按钮
		JButton jt = new JButton();
		jt.setText("开始");
		jt.setBounds(138, 100,100, 30);
		this.add(jt);
		//输出框
		JTextArea shu = new JTextArea();
		shu.setBounds(150, 150, 60, 30);
		this.add(shu);
		
		jt.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						//判断按钮是非触发
						if(jt.getText().equals("开始")){
							flag = true;
						}else if(jt.getText().equals("结束")){
							flag = false;
						}
						jt.setText("结束");//重置按钮
						while(flag){
							ja.setText((int)(Math.random()*10)+"");
						}
						//判断输入和随机数是否相同
						if(ja.getText().equals(ja2.getText())){
							shu.setText("相 同");
						}else{
							shu.setText("不相同");
						}
						
					}
				}).start();
				
			}
		});
		
		this.setBounds(0,0,400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

