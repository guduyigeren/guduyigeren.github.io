package com.test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SuiJi extends JFrame{
	boolean flag = true;
	public SuiJi(){
		this.setLayout(null);
		this.setTitle("�����");
		//�������
		JTextArea ja = new JTextArea();
		ja.setBounds(60,30,100,50);
		this.add(ja);
		//�����
		JTextArea ja2 = new JTextArea();
		ja2.setBounds(220, 30, 100, 50);
		this.add(ja2);
		//��ʼ��ť
		JButton jt = new JButton();
		jt.setText("��ʼ");
		jt.setBounds(138, 100,100, 30);
		this.add(jt);
		//�����
		JTextArea shu = new JTextArea();
		shu.setBounds(150, 150, 60, 30);
		this.add(shu);
		
		jt.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						//�жϰ�ť�ǷǴ���
						if(jt.getText().equals("��ʼ")){
							flag = true;
						}else if(jt.getText().equals("����")){
							flag = false;
						}
						jt.setText("����");//���ð�ť
						while(flag){
							ja.setText((int)(Math.random()*10)+"");
						}
						//�ж������������Ƿ���ͬ
						if(ja.getText().equals(ja2.getText())){
							shu.setText("�� ͬ");
						}else{
							shu.setText("����ͬ");
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

