public class Zoo{
	//public void weigou(ErHa erHa){
	//	System.out.println("玩一会");
		//erHa.eat();
	//}
	/*public void weigou(TaiDi taiDi){
		taiDi.eat();
	}*/
	public void weigou(Dog dog){
		System.out.println("玩一会");
		if(dog instanceof ErHa){
			((ErHa)dog).biaoqing();
		}
		dog.eat();
	}
}