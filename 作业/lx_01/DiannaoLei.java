public class DiannaoLei{
	String name;
	String xinghao;
	int jiage;
	String yanse;
	public DiannaoLei(String name,String xinghao,int jiage,String yanse){
		this.name = name;
		this.xinghao = xinghao;
		this.jiage = jiage;
		this.yanse = yanse;
	}
	public void dnl(){
		System.out.println("电脑品牌名:"+name+"\t型号:"+xinghao+"\t价格:"+jiage+"\t颜色:"+yanse);
	}

}