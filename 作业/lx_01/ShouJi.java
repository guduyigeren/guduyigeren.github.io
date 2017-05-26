public class ShouJi{
	public static void main(String [] args){
		//手机表信息
		Phone [] phones = new Phone[3];     //定义手机表数组
		Phone phone1 = new Phone("苹果","7Plus",6000,"磨砂黑");
		phones[0] = phone1;					//给第一个元素赋值
		Phone phone2 = new Phone("OPPO","R9",2200,"银白");
		phones[1] = phone2;					//给第二个元素赋值
		Phone phone3 = new Phone("华为","荣耀9",3000,"紫金");
		phones[2] = phone3;					//给第三个元素赋值

		//循环
	for(int i=0;i<phones.length;i++){
		phones[i].pho();
	}
}
}