package com.test;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JiShiBen extends JFrame{
	
	public JiShiBen(){
		//JFrame jframe = new JFrame("记事本");
		this.setLayout(null);
		this.setTitle("记事本");//标题记事本
		//this.getState();
		//初始化菜单栏
		JMenuBar jmenubar = new JMenuBar();
		
		JPanel jpanel = new JPanel();//初始化一个jpanel
		JFrame jframe = new JFrame();//初始化一个jframe
		jframe.setContentPane(jpanel);
		jframe.setJMenuBar(jmenubar);
		//菜单栏内容
		JMenu jmenu1 = new JMenu("文件");
		JMenu jmenu2 = new JMenu("编辑");
		JMenu jmenu3 = new JMenu("格式");
		JMenu jmenu4 = new JMenu("查看");
		JMenu jmenu5 = new JMenu("帮助");
		
		//jmenubar.add(jmenu1);
		//jmenubar.add(jmenu2);
		//jmenubar.add(jmenu3);
		//jmenubar.add(jmenu4);
		//jmenubar.add(jmenu5);
		//子菜单内容
		JMenuItem jim1 = new JMenuItem("新建");
		JMenuItem jim2 = new JMenuItem("打开");
		JMenuItem jim3 = new JMenuItem("保存");
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
		
		//创建文本域
		JTextArea jtextarea = new JTextArea();
		//jtextarea.setText("");
		jtextarea.setBounds(0, 0, 800, 800);
		jtextarea.setLineWrap(true);//激活换行功能
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
