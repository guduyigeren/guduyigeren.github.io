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
			System.out.println("=====��ѡ��һ�²���=====");
			System.out.println("=======1.������Ʒ=======");
			System.out.println("=======2.ɾ����Ʒ=======");
			System.out.println("=======3.�޸���Ʒ=======");
			System.out.println("=======4.��ѯ��Ʒ=======");
			System.out.println("=======5.�˳��˵�=======");
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
					System.out.println("�������,����������");
				caidan();
			}

		}
	}
	public static void add(){
		boolean qwe = true;
		while(qwe){
			System.out.println("���������ӵ���Ʒ����");
			System.out.println("��������Ʒ����");
			String name = sc.next();
			System.out.println("��������Ʒ�۸�");
			int jiage = sc.nextInt();
			System.out.println("��������Ʒ����");
			int shuliang = sc.nextInt();
			Cs csa = new Cs(name,jiage,shuliang);
			css[i] = csa;
			i++;
			boolean poi = true;
			System.out.println("��ӳɹ�,��ѡ����һ�����");
			while(poi){
				System.out.println("1.�������");
				System.out.println("2.���ز˵�");
				int as = sc.nextInt();
				if(as==1){
					add();
				}
				else if(as==2){
					caidan();
				}else{
					System.out.println("��������,����������");
				}

			}
		}
		

	}
	public static void delete(){
		System.out.println("��������Ҫɾ������Ʒ����");
		String n = sc.next();
		for(int i=0;i<css.length;i++){
			if(css[i]!= null&&css[i].name.equals(n)){
				css[i] = null;
			}
			
		}
		System.out.println("ɾ���ɹ�");
		boolean daf= true;
		while(daf){
			System.out.println("��ѡ����һ�����");
			System.out.println("1.������ѯ");
			System.out.println("2.���ز˵�");
			int df = sc.nextInt();
			if(df==1){
				update();
			}
			else if(df==2){
				caidan();
			}else{
				System.out.println("�������,����������");
			}

		}
	
	}
	public static void update(){
		System.out.println("������Ҫ�޸ĵ���Ʒ����");
		String nae = sc.next();
		for(int i = 0;i<css.length;i++){
			if(css[i]!=null&& css[i].name.equals(nae)){
			System.out.println("������Ʒ���ƣ�");
			String nc = sc.next();
			css[i].name = nc;
			System.out.println("������Ʒ�۸�");
			int ree = sc.nextInt();
			css[i].getjiage(ree);
			System.out.println("������Ʒ������");
			int aqa = sc.nextInt();
			css[i].getshuliang(aqa);
			System.out.println("��ӳɹ�����ѡ��һ�²���");
			boolean www = true;
			while(www){
				System.out.println("1.�����޸�");
				System.out.println("2.���ز˵�");
				int we = sc.nextInt();
				if(we==1){
						update();
					}
					else if(we==2){
						caidan();
					}
					else{
						System.out.println("�����������������");
					}
				}
			}
		}
		
	
	}
	public static void select(){
		System.out.println("��������Ҫ��ѯ����Ʒ����");
		String na = sc.next();
		int qw = 0;
		for(int i=0;i<css.length;i++){
			if(css[i]!=null&&css[i].name.equals(na)){
				css[i].chao();
				qw = 1;
			}
			
		}
		if(qw==0){
			System.out.println("�޷���ѯ������Ʒ");
		}
		boolean ret = true;
		while(ret){
			System.out.println("��ѡ����һ�����");
			System.out.println("1.������ѯ");
			System.out.println("2.���ز˵�");
			int ew = sc.nextInt();
			if(ew==1){
				select();
			}
			else if(ew==2){
				caidan();
			}else{
				System.out.println("�������,����������");
			}

		}
	
	}
}