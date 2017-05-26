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
			System.out.println("====请按菜单输入====");
			System.out.println("======1.增加========");
			System.out.println("======2.修改========");
			System.out.println("======3.删除========");
			System.out.println("======4.查询========");
			System.out.println("======5.退出========");
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
					System.out.println("输入错误");
					caidan();
			}
		}
	}
	public static void add(){
		
		boolean add = true;
		while(add){
			System.out.println("请输入学生信息");
			System.out.print("请输入学生姓名:");
			String name = sc.next();
			System.out.print("请输入学生年龄:");
			int age  = sc.nextInt();
			System.out.print("请输入学生性别:");
			char sex = sc.next().charAt(0);
			Xuesheng xuesheng = new Xuesheng(name,age,sex);
			xueshengs[i] = xuesheng;
			i++;
			boolean asd = true;
			System.out.println("添加成功,请选择下一项操作");
			while(asd){
				//System.out.println("请选择下一项操作");
				System.out.println("1.继续添加");
				System.out.println("2.返回菜单");
				int flga2 = sc.nextInt();
				if(flga2==1){
					add = true;
					add();
				}
				else if(flga2==2){
					add = false;
					caidan();
				}else{
					System.out.println("输入有误，请重新输入");	
				}
			}
			
		}
		caidan();
	}
	public static void update(){
		System.out.println("请输入需要修改的学生姓名");
		String ns = sc.next();
		for(int i=0;i<xueshengs.length;i++){
				
				
			if(xueshengs[i]!=null&& xueshengs[i].name.equals(ns)){
				
				
					System.out.print("请输入姓名:");
					String zaq = sc.next();
					xueshengs[i].name = zaq;
					System.out.print("请输入年龄:");
					int xsw = sc.nextInt();
					xueshengs[i].getage(xsw);
				
				
					System.out.print("请输入性别:");
					char cde = sc.next().charAt(0);
					xueshengs[i].getsex(cde);
					xueshengs[i].xs();
			}	
		}
	}
	public static void delete(){
		System.out.println("请输入要删除的学生姓名");
		String na = sc.next();
		for(int i=0;i<xueshengs.length;i++){
			if(xueshengs[i]!= null){
					xueshengs[i]=null;
				}
			}
			System.out.println("删除成功，请选择下一步操作");
			System.out.println("1.继续删除");
			System.out.println("2.返回菜单");
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
			System.out.println("请输入要查询的学生姓名");
			String n = sc.next();
			for(int i=0;i<xueshengs.length;i++){
					if(xueshengs[i]!=null && xueshengs[i].name.equals(n)){
						xueshengs[i].xs();
						fla=1;
				}
			}
			if(fla==0){
				System.out.println("无法查询到此人");
				}
			
			boolean zxc = true;
			
			while(zxc){
			System.out.println("请选择下一项操作");
			System.out.println("1.继续查询");
			System.out.println("2.返回菜单");
			int fa = sc.nextInt();
			if(fa==1){
				select=true;
				select();
			}else if(fa==2){
				select=false;
				caidan();
			}else{
				System.out.println("输入错误请重新输入");
			}
			
			}
			
		}
		caidan();
	
	}
}