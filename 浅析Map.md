- Map的概念: 
     
    -Map可以称为字典，Map集合里存在两组值，一组是key，一组是value。Map里的key不允许重复。通过key总能找到唯一的value与之对应。 

- Map的常用方法:
    
     -void clear()：删除该Map对象中的所有key—value对。清理该集合。

     -put()：添加Map对象中的key-value对。

     -remov()：删除该Map对象中的一个key—value对。

     -get()： 返回key对应的value，若Map中不包含key，则返回null。 
- 例如：

```
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
	}
}
以上是HashMap的例子。
```

```
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
	}
}
以上是TreeMap的例子。
```
- Map集合的常用类：

    Hashtable：线程安全，速度慢，不允许存放null键，null值。

     HashMap：线程不安全，速度快，允许存放null键，null值。

     TreeMap：对key进行排序，排序原理与TreeSet相同。

















