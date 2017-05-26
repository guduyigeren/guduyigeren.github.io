package com.test;

import java.awt.Color;

public class QiZi {
	private int x;//x×ø±ê
	private int y;//y×ø±ê
	private Color color;
	public static final int size = 40;
	public QiZi(int x,int y){
		this.x = x;
		this.y = y;
	}
	public QiZi(int x,int y,Color color){
		this.setX(x);
		this.setY(y);
		this.setColor(color);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String toString(){
		return x+""+y+""+color;
		
	}
}
