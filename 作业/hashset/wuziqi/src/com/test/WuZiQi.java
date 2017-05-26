package com.test;

import javax.swing.JFrame;

public class WuZiQi extends JFrame{
	
	public WuZiQi(){
		this.setLayout(null);
		
		QiPan qp = new QiPan();
		qp.setBounds(130,130,600,600);
		this.add(qp);
		
		this.setTitle("Îå×ÓÆå");
		this.setBounds(100, 100, 800, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WuZiQi();
	}

}
