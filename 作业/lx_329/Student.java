import java.util.*;
public class Student{
	static Scanner sc = new Scanner(System.in);
	static Xuesheng[] xueshengs = new Xuesheng[50];
	static int i=0;
	static String name;
	public static void main(String [] args){
		caidan();
	}
	public static void caidan(){
		while(true){
			System.out.println("====�밴�˵�����====");
			System.out.println("======1.����========");
			System.out.println("======2.�޸�========");
			System.out.println("======3.ɾ��========");
			System.out.println("======4.��ѯ========");
			System.out.println("======5.�˳�========");
			int flag = sc.nextInt();
			switch(flag){
				case 1 :
					add();
					break;
				case 2 :
					update();
					break;
				case 3 :
					delete();
					break;
				case 4 :
					select();
					break;
				case 5 :
					System.exit(0);
					break;
				default:
					System.out.println("�������");
					caidan();
			}
		}
	}
	public static void add(){
		
		boolean add = true;
		while(add){
			System.out.println("������ѧ����Ϣ");
			System.out.print("������ѧ������:");
			String name = sc.next();
			System.out.print("������ѧ������:");
			int age  = sc.nextInt();
			System.out.print("������ѧ���Ա�:");
			char sex = sc.next().charAt(0);
			Xuesheng xuesheng = new Xuesheng(name,age,sex);
			xueshengs[i] = xuesheng;
			i++;
			boolean asd = true;
			System.out.println("��ӳɹ�,��ѡ����һ�����");
			while(asd){
				//System.out.println("��ѡ����һ�����");
				System.out.println("1.�������");
				System.out.println("2.���ز˵�");
				int flga2 = sc.nextInt();
				if(flga2==1){
					add = true;
					add();
				}
				else if(flga2==2){
					add = false;
					caidan();
				}else{
					System.out.println("������������������");	
				}
			}
			
		}
		caidan();
	}
	public static void update(){
		System.out.println("��������Ҫ�޸ĵ�ѧ������");
		String ns = sc.next();
		for(int i=0;i<xueshengs.length;i++){
				
				
			if(xueshengs[i]!=null&& xueshengs[i].name.equals(ns)){
				
				
					System.out.print("����������:");
					String zaq = sc.next();
					xueshengs[i].name = zaq;
					System.out.print("����������:");
					int xsw = sc.nextInt();
					xueshengs[i].getage(xsw);
				
				
					System.out.print("�������Ա�:");
					char cde = sc.next().charAt(0);
					xueshengs[i].getsex(cde);
					xueshengs[i].xs();
			}	
		}
	}
	public static void delete(){
		System.out.println("������Ҫɾ����ѧ������");
		String na = sc.next();
		for(int i=0;i<xueshengs.length;i++){
			if(xueshengs[i]!= null){
					xueshengs[i]=null;
				}
			}
			System.out.println("ɾ���ɹ�����ѡ����һ������");
			System.out.println("1.����ɾ��");
			System.out.println("2.���ز˵�");
			int bs = sc.nextInt();
			if(bs==1){
				delete();
			}else if(bs==2){
				caidan();
			}
		
	}
	public static void select(){
		boolean select= true;
		while(select){
			int fla=0;
			System.out.println("������Ҫ��ѯ��ѧ������");
			String n = sc.next();
			for(int i=0;i<xueshengs.length;i++){
					if(xueshengs[i]!=null && xueshengs[i].name.equals(n)){
						xueshengs[i].xs();
						fla=1;
				}
			}
			if(fla==0){
				System.out.println("�޷���ѯ������");
				}
			
			boolean zxc = true;
			
			while(zxc){
			System.out.println("��ѡ����һ�����");
			System.out.println("1.������ѯ");
			System.out.println("2.���ز˵�");
			int fa = sc.nextInt();
			if(fa==1){
				select=true;
				select();
			}else if(fa==2){
				select=false;
				caidan();
			}else{
				System.out.println("�����������������");
			}
			
			}
			
		}
		caidan();
	
	}
}