import java.util.*;
public class ArrayListDeom{
	public static void main(String [] args){
		//创建ArrayList集合
		List<String> ls = new ArrayList<String>();
		//添加元素
		ls.add("li");
		ls.add("xu");
		ls.add("wang");
		ls.add("liu");
		//移除一个元素
		ls.remove("xu");
		//移除所有元素
		//ls.clear();
		//输出返回指定元素
		//ls.get(1);
		System.out.println("指定元素是"+ls.get(1));
		//输出指定元素的个数  ls.size();
		System.out.println("列表的元素数量是"+ls.size());
		//迭代器   遍历
		Iterator it = ls.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*for - each  遍历
		for(String a:ls){
			System.out.println(a);
		}
		*/
	}
}