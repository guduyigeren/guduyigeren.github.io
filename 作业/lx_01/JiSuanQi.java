import java.util.Scanner;
public class JiSuanQi{
	public static void main(String args []){
		System.out.println("请输入一个数");
		Scanner sc = new Scanner(System.in);
		//Scanner sa = new Scanner(System.in);
		int sca = sc.nextInt();
		int sac = sc.nextInt();
		System.out.println("加"+sca+"+"+sac+"="+(sca+sac));
		System.out.println("减"+sca+"-"+sac+"="+(sca-sac));
		System.out.println("乘"+sca+"*"+sac+"="+(sca*sac));
		System.out.println("除"+sca+"/"+sac+"="+(sca/sac));
	}
}