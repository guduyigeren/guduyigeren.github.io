public class Phone{
	//声明手机信息
	String name;	//手机品牌名
	String xinghao;		//手机型号
	int jiage;		//手机价格
	String yanse;	//手机颜色

	public Phone(String name,String xinghao,int jiage,String yanse){
		this.name = name;
		this.xinghao = xinghao;
		this.jiage = jiage;
		this.yanse = yanse;
	}
	public void pho(){
		System.out.println("手机品牌名:"+name+"\t型号:"+xinghao+"\t价格:"+jiage+"\t颜色:"+yanse);
	}

}