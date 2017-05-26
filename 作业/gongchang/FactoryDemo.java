//手机标准
interface ICellPhone{
	void sendMsg();
}
//HTC手机
class HTC implements ICellPhone {
	public void sendMsg(){
		System.out.println("我是HTC");
	}
}
//IPhone 手机
class IPhone implements ICellPhone {
	public void sendMsg(){
		System.out.println("我是IPhone");
	}
}
//手机工厂
class Factory{
	public static ICellPhone getInstance(String type){
		ICellPhone phone = null;
		if("htc".equalsIgnoreCase(type)){
			phone = new HTC();
		}
		else if("iphone".equalsIgnoreCase(type)){
			phone = new IPhone();
		}
		return phone;
	}
}
public class FactoryDemo{
	public static void main(String [] args){
		//ICellPhone p = new HTC();
		ICellPhone p = Factory.getInstance("htc");
		p.sendMsg();
	}
}