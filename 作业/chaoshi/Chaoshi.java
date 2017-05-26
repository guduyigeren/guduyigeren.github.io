import java.util.*;
public class Chaoshi{
	static Scanner sc = new Scanner(System.in);
	static Cs [] css = new Cs[30];
	static int i = 0;
	static String name;
	public static void main(String [] args){
		caidan();	
	}
	public static void caidan(){
		while(true){
			System.out.println("=====请选择一下操作=====");
			System.out.println("=======1.增加商品=======");
			System.out.println("=======2.删除商品=======");
			System.out.println("=======3.修改商品=======");
			System.out.println("=======4.查询商品=======");
			System.out.println("=======5.退出菜单=======");
			int a = sc.nextInt();
			switch(a){
				case 1 :
					add();
				break;
				case 2 :
					delete();
				break;
				case 3 :
					update();
				break;
				case 4 :
					select();
				break;
				case 5 :
					System.exit(0);
				break;
				default :
					System.out.println("输入错误,请重新输入");
				caidan();
			}

		}
	}
	public static void add(){
		boolean qwe = true;
		while(qwe){
			System.out.println("请输入增加的商品名称");
			System.out.println("请输入商品名称");
			String name = sc.next();
			System.out.println("请输入商品价格");
			int jiage = sc.nextInt();
			System.out.println("请输入商品数量");
			int shuliang = sc.nextInt();
			Cs csa = new Cs(name,jiage,shuliang);
			css[i] = csa;
			i++;
			boolean poi = true;
			System.out.println("添加成功,请选择下一项操作");
			while(poi){
				System.out.println("1.继续添加");
				System.out.println("2.返回菜单");
				int as = sc.nextInt();
				if(as==1){
					add();
				}
				else if(as==2){
					caidan();
				}else{
					System.out.println("输入有误,请重新输入");
				}

			}
		}
		

	}
	public static void delete(){
		System.out.println("请输入需要删除的商品名称");
		String n = sc.next();
		for(int i=0;i<css.length;i++){
			if(css[i]!= null&&css[i].name.equals(n)){
				css[i] = null;
			}
			
		}
		System.out.println("删除成功");
		boolean daf= true;
		while(daf){
			System.out.println("请选在下一项操作");
			System.out.println("1.继续查询");
			System.out.println("2.返回菜单");
			int df = sc.nextInt();
			if(df==1){
				update();
			}
			else if(df==2){
				caidan();
			}else{
				System.out.println("输入错误,请重新输入");
			}

		}
	
	}
	public static void update(){
		System.out.println("输入需要修改的商品名称");
		String nae = sc.next();
		for(int i = 0;i<css.length;i++){
			if(css[i]!=null&& css[i].name.equals(nae)){
			System.out.println("输入商品名称：");
			String nc = sc.next();
			css[i].name = nc;
			System.out.println("输入商品价格：");
			int ree = sc.nextInt();
			css[i].getjiage(ree);
			System.out.println("输入商品数量：");
			int aqa = sc.nextInt();
			css[i].getshuliang(aqa);
			System.out.println("添加成功，请选择一下操作");
			boolean www = true;
			while(www){
				System.out.println("1.继续修改");
				System.out.println("2.返回菜单");
				int we = sc.nextInt();
				if(we==1){
						update();
					}
					else if(we==2){
						caidan();
					}
					else{
						System.out.println("输入错误，请重新输入");
					}
				}
			}
		}
		
	
	}
	public static void select(){
		System.out.println("请输入想要查询的商品名称");
		String na = sc.next();
		int qw = 0;
		for(int i=0;i<css.length;i++){
			if(css[i]!=null&&css[i].name.equals(na)){
				css[i].chao();
				qw = 1;
			}
			
		}
		if(qw==0){
			System.out.println("无法查询到此商品");
		}
		boolean ret = true;
		while(ret){
			System.out.println("请选在下一项操作");
			System.out.println("1.继续查询");
			System.out.println("2.返回菜单");
			int ew = sc.nextInt();
			if(ew==1){
				select();
			}
			else if(ew==2){
				caidan();
			}else{
				System.out.println("输入错误,请重新输入");
			}

		}
	
	}
}