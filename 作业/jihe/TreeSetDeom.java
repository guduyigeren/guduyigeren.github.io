import java.util.*;
public class TreeSetDeom{
	public static void main(String [] args){
		//创建TreeSet集合
		Set<String> ts = new TreeSet<String>();
		//添加元素
		ts.add("aa");
		ts.add("ac");
		ts.add("ab");
		ts.add("ae");
		//移除一个指定元素
		ts.remove("ae");
		//移除所有元素
		//ts.clear();
		//查找指定元素的个数
		//ts.size();
		System.out.println("指定元素的个数是"+ts.size());
		//迭代器   遍历
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*
			for - each 遍历
		for(String s:ts){
			System.out.println(s);
		}
		*/
	}
}