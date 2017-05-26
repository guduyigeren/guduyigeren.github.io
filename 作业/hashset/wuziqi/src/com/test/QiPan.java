package com.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class QiPan extends JComponent implements MouseListener{
	List<QiZi> list = new ArrayList<QiZi>();
	private boolean Hei = false;
	private int weizhix = 0;//��ǰ����x���λ��
	private int weizhiy = 0;//��ǰ����y���λ��
	private boolean Sheng = false;
	public QiPan(){
		this.addMouseListener(this);
	}
	//������������
	public void paint(Graphics g){
		//��������
		for(int i = -1;i<10;i++){
			g.drawLine(20,(i*50+70),520,(i*50+70));
			g.drawLine((i*50+70),20,(i*50+70),520);
		};
		//��������
		for(QiZi q:list){
			//�������ӵĴ�С
			g.fillOval(q.getX(), q.getY(), QiZi.size, QiZi.size);
			//���ӵ���ɫ
			g.setColor(q.getColor());
		}
		//�ж���Ӯ
		GuiZe();
		if(Sheng==true){
			g.setColor(Color.red);
			g.setFont(new Font("����",Font.ITALIC,40));
			g.drawString("ʤ", 300, 300);
		}
	}
	//�ж���Ӯ�Ĺ���
	public void GuiZe(){
		
		int dx = 0;
		//��
		for(int X= weizhix,i = 0;X<=520&&i<5;X+=50,i++){
			QiZi qizi = FindQiZi(X,weizhiy);
			if(qizi!=null){
				//�жϵ�ǰ��ʵ�Ǻ���
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dx++;
					}
				}else if(Hei!=false){
					//��ǰ�����ǰ���
					if(qizi.getColor()==Color.white){
						dx++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		//��
		for(int X = weizhix-50,i=0;X>=0&&i<5;X-=50,i++){
			QiZi qizi = FindQiZi(X,weizhiy);
			if(qizi!=null){
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dx++;
					}
				}
				if(Hei!=false){
					if(qizi.getColor()==Color.white){
						dx++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		if(dx>=5){
			Sheng = true;
			if(Hei==true){
				System.out.println("����ʤ");
			}else{
				System.out.println("����ʤ");
			}
		}
		int nb = 0;
		//��
		for(int Y = weizhiy,i=0;Y<=520&&i<5;Y+=50,i++){
			QiZi qizi = FindQiZi(weizhix,Y);
			if(qizi!=null){
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						nb++;
					}
				}else if(Hei!=false){
					if(qizi.getColor()==Color.white){
						nb++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		
		//��
		for(int Y = weizhiy-50,i = 0;Y>=0&&i<5;Y-=50,i++){
			QiZi qizi = FindQiZi(weizhix,Y);
			if(qizi!=null){
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						nb++;
					}
				}else if(Hei!=false){
					if(qizi.getColor()==Color.white){
						nb++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		if(nb>=5){
			Sheng = true;
			if(Hei==true){
				System.out.println("����ʤ");
			}else{
				System.out.println("����ʤ");
			}
		}
		int dbxn = 0;
		//����
		for(int X= weizhix,Y=weizhiy,i = 0;Y>=0&&X<=520&&i<5;X+=50,Y-=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//�жϵ�ǰ��ʵ�Ǻ���
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dbxn++;
					}
				}else if(Hei!=false){
					//��ǰ�����ǰ���
					if(qizi.getColor()==Color.white){
						dbxn++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		//����
		for(int X= weizhix-50,Y=weizhiy+50,i = 0;Y<=520&&X>=0&&i<5;X-=50,Y+=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//�жϵ�ǰ��ʵ�Ǻ���
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dbxn++;
					}
				}else if(Hei!=false){
					//��ǰ�����ǰ���
					if(qizi.getColor()==Color.white){
						dbxn++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		if(dbxn>=5){
			Sheng = true;
			if(Hei==true){
				System.out.println("����ʤ");
			}else{
				System.out.println("����ʤ");
			}
		}
		int dnxb = 0;
		//����
		for(int X= weizhix,Y=weizhiy,i = 0;X<=520&&Y<=520&&i<5;X+=50,Y+=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//�жϵ�ǰ��ʵ�Ǻ���
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dnxb++;
					}
				}else if(Hei!=false){
					//��ǰ�����ǰ���
					if(qizi.getColor()==Color.white){
						dnxb++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		//����
		for(int X= weizhix-50,Y=weizhiy-50,i = 0;X>=0&&Y>=0&&i<5;X-=50,Y-=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//�жϵ�ǰ��ʵ�Ǻ���
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dnxb++;
					}
				}else if(Hei!=false){
					//��ǰ�����ǰ���
					if(qizi.getColor()==Color.white){
						dnxb++;
					}
				}else{
					break;
				}
			}
			else{
				break;
			}
		}
		if(dnxb>=5){
			Sheng = true;
			if(Hei==true){
				System.out.println("����ʤ");
			}else{
				System.out.println("����ʤ");
			}
		}
	}

	//�ҵ�
	public QiZi FindQiZi(int x,int y){
		//boolean Have = false;
		for(QiZi q:list){
			if(q.getX()==x&& q.getY() == y){
			//�ж������Ƿ�����ͬ�ĵ�.
				return q;
			}
		}
		return null;
	}
	public void mouseClicked(MouseEvent e) {
		//System.out.println(e.getX()+"  "+e.getY());
		int x = e.getX();
		int y = e.getY();
		//�����������������
		double xianx = Math.round((x-20)/50.0);//���x��
		double xiany = Math.round((y-20)/50.0);//���y��
		
		x = (int) xianx*50;
		y = (int) xiany*50;
		//��ǰ���ӵ�λ��
		weizhix = x;
		weizhiy = y;
		
		//int x =e.getX()-QiZi.size/2;
		//int y =e.getY()-QiZi.size/2;
		
		boolean Have = false;
		for(QiZi q:list){
			if(q.getX()==x&& q.getY() == y){
				Have = true;
			}
		}
		//���Ա����ظ���������
		if(!Have){
			QiZi qizi = new QiZi(x,y);
			if(Hei==true){
				//������
				qizi.setColor(Color.black);
				Hei = false;
			}else{
				//������
				qizi.setColor(Color.white);
				Hei = true;
			}
			//�������ӵ�List
			if(Sheng==false){
				list.add(qizi);
			}
			
			//�������»���
			this.repaint();
		}
		System.out.println("������"+list.size());
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
}
