public class School{
	String name;	//学校名字
	String dizhi;	//学校地址
	String mianji;	//学校面积
	int jsrenshu;	//学校老师人数
	int xsrenshu;//学校学生人数
	public School(String name,String dizhi,String mianji,int jsrenshu,int xsrenshu){
		this.name = name;
		this.dizhi = dizhi;
		this.mianji = mianji;
		this.jsrenshu = jsrenshu;
		this.xsrenshu = xsrenshu;

	}
	public void shl(){
		System.out.println("学校名字:"+name+"\t地址:"+dizhi+"\t面积:"+mianji+"\t教师人数:"+jsrenshu+"\t学生人数:"+xsrenshu);
	}
}