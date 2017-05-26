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
	private int weizhix = 0;//当前棋子x轴的位置
	private int weizhiy = 0;//当前棋子y轴的位置
	private boolean Sheng = false;
	public QiPan(){
		this.addMouseListener(this);
	}
	//绘制棋盘内容
	public void paint(Graphics g){
		//绘制棋盘
		for(int i = -1;i<10;i++){
			g.drawLine(20,(i*50+70),520,(i*50+70));
			g.drawLine((i*50+70),20,(i*50+70),520);
		};
		//绘制棋子
		for(QiZi q:list){
			//绘制棋子的大小
			g.fillOval(q.getX(), q.getY(), QiZi.size, QiZi.size);
			//棋子的颜色
			g.setColor(q.getColor());
		}
		//判断输赢
		GuiZe();
		if(Sheng==true){
			g.setColor(Color.red);
			g.setFont(new Font("宋体",Font.ITALIC,40));
			g.drawString("胜", 300, 300);
		}
	}
	//判断输赢的规则
	public void GuiZe(){
		
		int dx = 0;
		//东
		for(int X= weizhix,i = 0;X<=520&&i<5;X+=50,i++){
			QiZi qizi = FindQiZi(X,weizhiy);
			if(qizi!=null){
				//判断当前其实是黑棋
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dx++;
					}
				}else if(Hei!=false){
					//当前棋子是白棋
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
		//西
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
				System.out.println("黑子胜");
			}else{
				System.out.println("白子胜");
			}
		}
		int nb = 0;
		//南
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
		
		//北
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
				System.out.println("黑子胜");
			}else{
				System.out.println("白子胜");
			}
		}
		int dbxn = 0;
		//东北
		for(int X= weizhix,Y=weizhiy,i = 0;Y>=0&&X<=520&&i<5;X+=50,Y-=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//判断当前其实是黑棋
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dbxn++;
					}
				}else if(Hei!=false){
					//当前棋子是白棋
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
		//西南
		for(int X= weizhix-50,Y=weizhiy+50,i = 0;Y<=520&&X>=0&&i<5;X-=50,Y+=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//判断当前其实是黑棋
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dbxn++;
					}
				}else if(Hei!=false){
					//当前棋子是白棋
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
				System.out.println("黑子胜");
			}else{
				System.out.println("白子胜");
			}
		}
		int dnxb = 0;
		//东南
		for(int X= weizhix,Y=weizhiy,i = 0;X<=520&&Y<=520&&i<5;X+=50,Y+=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//判断当前其实是黑棋
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dnxb++;
					}
				}else if(Hei!=false){
					//当前棋子是白棋
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
		//西北
		for(int X= weizhix-50,Y=weizhiy-50,i = 0;X>=0&&Y>=0&&i<5;X-=50,Y-=50,i++){
			QiZi qizi = FindQiZi(X,Y);
			if(qizi!=null){
				//判断当前其实是黑棋
				if(Hei!=true){
					if(qizi.getColor()==Color.black){
						dnxb++;
					}
				}else if(Hei!=false){
					//当前棋子是白棋
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
				System.out.println("黑子胜");
			}else{
				System.out.println("白子胜");
			}
		}
	}

	//找点
	public QiZi FindQiZi(int x,int y){
		//boolean Have = false;
		for(QiZi q:list){
			if(q.getX()==x&& q.getY() == y){
			//判断坐标是否有相同的点.
				return q;
			}
		}
		return null;
	}
	public void mouseClicked(MouseEvent e) {
		//System.out.println(e.getX()+"  "+e.getY());
		int x = e.getX();
		int y = e.getY();
		//算出棋子在那条线上
		double xianx = Math.round((x-20)/50.0);//算出x轴
		double xiany = Math.round((y-20)/50.0);//算出y轴
		
		x = (int) xianx*50;
		y = (int) xiany*50;
		//当前棋子的位置
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
		//可以避免重复绘制棋子
		if(!Have){
			QiZi qizi = new QiZi(x,y);
			if(Hei==true){
				//黑棋先
				qizi.setColor(Color.black);
				Hei = false;
			}else{
				//白棋子
				qizi.setColor(Color.white);
				Hei = true;
			}
			//保存棋子到List
			if(Sheng==false){
				list.add(qizi);
			}
			
			//触发重新绘制
			this.repaint();
		}
		System.out.println("棋子数"+list.size());
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
