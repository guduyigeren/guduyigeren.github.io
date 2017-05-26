import java.util.*;
public class HashSetDeom{
	public static void main(String [] args){
		//创建HashSet集合
		Set<String> ha = new HashSet<String>();
		//添加元素
		ha.add("aa");
		ha.add("da");
		ha.add("ca");
		ha.add("bd");
		//元素相同时有时会覆盖有时不显示
		//ha.add("aa");
		//移除指定的一个元素
		ha.remove("da");
		//移除所有元素
		//ha.clear();
		//查询指定元素的个数
		//ha.size();
		System.out.println("指定元素的个数"+ha.size());
		//迭代器   遍历
		Iterator it = ha.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*
			for - each  遍历
		for(String s:ha){
			System.out.println(s);
		}
		*/

	}
}