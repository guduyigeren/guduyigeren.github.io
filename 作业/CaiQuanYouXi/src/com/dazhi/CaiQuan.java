package com.dazhi;
import java.util.*;
public class CaiQuan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("----��ȭС��Ϸ----");
			System.out.println("1.����,2.ʯͷ,3,��");
			int a = sc.nextInt();  //�����������
			int b = (int)(Math.random()*3)+1;  //���������������
			String yonghu = null;  //�û�������
			String diannao = null;	//���Ե�����
			switch(a){
				case 1:yonghu = "����";
				break;
				case 2:yonghu = "ʯͷ";
				break;
				case 3:yonghu = "��";
			}
			switch(b){
				case 1:diannao = "����";
				break;
				case 2:diannao = "ʯͷ";
				break;
				case 3:diannao = "��";
			}
			//�ж��Ƿ�ƽ��
			if(a==1&&b==1||a==2&&b==2||a==3&&b==3){
				System.out.println("�������"+a+"���Գ�����"+b);
				System.out.println("ƽ��");
			}
			//�ж��Ƿ�Ӯ
			if(a==1&&b==3||a==2&&b==1||a==3&&b==20){
				System.out.println("�������"+a+"���Գ�����"+b);
				System.out.println("��ϲ��Ӯ��");
			}
			//�ж��Ƿ���
			if(a==1&&b==2||a==2&&b==3||a==3&&b==1){
				System.out.println("�������"+a+"���Գ�����"+b);
				System.out.println("������");
			}
		}
	}	
}
