import java.util.Scanner;
public class JiSuanQi{
	public static void main(String args []){
		System.out.println("������һ����");
		Scanner sc = new Scanner(System.in);
		//Scanner sa = new Scanner(System.in);
		int sca = sc.nextInt();
		int sac = sc.nextInt();
		System.out.println("��"+sca+"+"+sac+"="+(sca+sac));
		System.out.println("��"+sca+"-"+sac+"="+(sca-sac));
		System.out.println("��"+sca+"*"+sac+"="+(sca*sac));
		System.out.println("��"+sca+"/"+sac+"="+(sca/sac));
	}
}