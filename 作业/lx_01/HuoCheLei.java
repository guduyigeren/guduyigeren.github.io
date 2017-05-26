public class HuoCheLei{
	// 火车表信息
	String name;		//火车名
	String chexing;		//火车车型
	String sudu;		//火车速度
	
	public HuoCheLei(String name,String chexing,String sudu){
		this.name = name;
		this.chexing = chexing;
		this.sudu = sudu;
	}
	public void hcl(){
		System.out.println("火车名:"+name+"\t车型:"+chexing+"\t速度:"+sudu);
	}

	
}