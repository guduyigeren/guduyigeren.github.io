import java.util.*;
public class TreeMapDeom{
	public static void main(String [] args){
		//创建TreeMap集合
		Map<String,String> tm = new TreeMap<String,String>();
		//添加映射
		tm.put("1","xiaoming");
		tm.put("2","xiaoqiang");
		tm.put("3","xiaopang");
		tm.put("4","xiaofeng");
		//移除指定映射
		tm.remove("3");
		//移除所有映射
		//tm.clear();
		//查找映射指定值
		//tm.get("4");
		System.out.println(tm.get("4"));
		//返回hm映射
		Set<String> k=tm.keySet();
		//迭代器    遍历
		Iterator it = k.iterator();
		while(it.hasNext()){
			String keys = (String)it.next();
			String t = tm.get(keys);
			System.out.println(keys+""+t);
		}
		/*
		 // for - each 遍历
		for(String s:k){
			System.out.println(s+""+tm.get(s));
		}
		*/
	}
}