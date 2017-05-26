public class Cs{
	String name;
	private int jiage;
	private int shuliang;
	public Cs(String name,int jiage,int shuliang){
		this.name = name;
		this.jiage = jiage;
		this.shuliang = shuliang;
	}
	public void chao(){
		System.out.println("商品名:"+name+"商品价格:"+jiage+"商品数量"+shuliang);
	}
}