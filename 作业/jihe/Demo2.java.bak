import java.util.*;
public class Demo2{
	public static void main(String [] args){
		Map<String,String> map = new TreeMap<String,String>();
		map.put("1","Monday");
		map.put("one","Monday");
		map.put("2","Tuesday");
		map.put("3","Wensday");
		Set<String> keys=map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+""+value);
		}
	}
}