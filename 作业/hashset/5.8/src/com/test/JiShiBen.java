package com.test;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JiShiBen extends JFrame{
	
	public JiShiBen(){
		//JFrame jframe = new JFrame("���±�");
		this.setLayout(null);
		this.setTitle("���±�");//������±�
		//this.getState();
		//��ʼ���˵���
		JMenuBar jmenubar = new JMenuBar();
		
		JPanel jpanel = new JPanel();//��ʼ��һ��jpanel
		JFrame jframe = new JFrame();//��ʼ��һ��jframe
		jframe.setContentPane(jpanel);
		jframe.setJMenuBar(jmenubar);
		//�˵�������
		JMenu jmenu1 = new JMenu("�ļ�");
		JMenu jmenu2 = new JMenu("�༭");
		JMenu jmenu3 = new JMenu("��ʽ");
		JMenu jmenu4 = new JMenu("�鿴");
		JMenu jmenu5 = new JMenu("����");
		
		//jmenubar.add(jmenu1);
		//jmenubar.add(jmenu2);
		//jmenubar.add(jmenu3);
		//jmenubar.add(jmenu4);
		//jmenubar.add(jmenu5);
		//�Ӳ˵�����
		JMenuItem jim1 = new JMenuItem("�½�");
		JMenuItem jim2 = new JMenuItem("��");
		JMenuItem jim3 = new JMenuItem("����");
		//jmenu1.add(jim1);
		//jmenu1.addSeparator();
		//jmenu1.add(jim2);
		//jmenu1.addSeparator();
		//jmenu1.add(jim3);
		
		jmenu1.add(jim1);
		jmenubar.add(jmenu1);
		this.setJMenuBar(jmenubar);
		jmenu1.add(jim2);
		jmenubar.add(jmenu1);
		this.setJMenuBar(jmenubar);
		jmenu1.add(jim3);
		jmenubar.add(jmenu1);
		this.setJMenuBar(jmenubar);
		jmenubar.add(jmenu2);
		jmenubar.add(jmenu3);
		jmenubar.add(jmenu4);
		jmenubar.add(jmenu5);
		
		//�����ı���
		JTextArea jtextarea = new JTextArea();
		//jtextarea.setText("");
		jtextarea.setBounds(0, 0, 800, 800);
		jtextarea.setLineWrap(true);//����й���
		this.add(jtextarea);
		
		this.setJMenuBar(jmenubar);
		this.setBounds(300,300,800,800);
		this.setVisible(true);
		
		jim3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = new File("src/com/test/text.txt");
				try {
					file.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					FileWriter fwr = new FileWriter(file);
					String s = jtextarea.getText();
					fwr.write(s);
					fwr.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	public static void main(String[] args) {
		new JiShiBen();
	}

}
