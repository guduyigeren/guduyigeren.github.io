public class Zoo{
	//public void weigou(ErHa erHa){
	//	System.out.println("��һ��");
		//erHa.eat();
	//}
	/*public void weigou(TaiDi taiDi){
		taiDi.eat();
	}*/
	public void weigou(Dog dog){
		System.out.println("��һ��");
		if(dog instanceof ErHa){
			((ErHa)dog).biaoqing();
		}
		dog.eat();
	}
}