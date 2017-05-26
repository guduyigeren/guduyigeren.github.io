interface ICellPhone{
	void sendMsg();
}
class Factory{
	public static ICellphone getInstance(String type){
		ICelPhone p = null;
		if("htc".equalsIgnoreCase(type)){
			ff = new HTC();
		}
		else if("iphoe".equlsIgnoreCase(type)){
			ff = new Iphone();		
		}
	}
	return p;
}