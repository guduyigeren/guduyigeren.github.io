import java.util.*;
public class HashMapDeom{
	public static void main(String [] args){
		//创建HashMap集合
		Map<String,String> hm = new HashMap<String,String>();
		//添加映射
		hm.put("1","xiaoming");
		hm.put("2","xiaoqiang");
		hm.put("3","xiaopang");
		hm.put("4","xiaofeng");
		//移除指定映射
		hm.remove("3");
		//移除所有映射
		//hm.clear();
		//查找映射指定值
		//hm.get("4");
		System.out.println(hm.get("4"));
		//返回hm映射
		Set<String> k=hm.keySet();
		//迭代器    遍历
		Iterator it = k.iterator();
		while(it.hasNext()){
			String keys = (String)it.next();
			String h = hm.get(keys);
			System.out.println(keys+""+h);
		}
		/*
		  for - each 遍历
		for(String s:k){
			System.out.println(s+""+hm.get(s));
		}
		*/
	}
}