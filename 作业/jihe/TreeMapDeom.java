import java.util.*;
public class TreeMapDeom{
	public static void main(String [] args){
		//����TreeMap����
		Map<String,String> tm = new TreeMap<String,String>();
		//���ӳ��
		tm.put("1","xiaoming");
		tm.put("2","xiaoqiang");
		tm.put("3","xiaopang");
		tm.put("4","xiaofeng");
		//�Ƴ�ָ��ӳ��
		tm.remove("3");
		//�Ƴ�����ӳ��
		//tm.clear();
		//����ӳ��ָ��ֵ
		//tm.get("4");
		System.out.println(tm.get("4"));
		//����hmӳ��
		Set<String> k=tm.keySet();
		//������    ����
		Iterator it = k.iterator();
		while(it.hasNext()){
			String keys = (String)it.next();
			String t = tm.get(keys);
			System.out.println(keys+""+t);
		}
		/*
		 // for - each ����
		for(String s:k){
			System.out.println(s+""+tm.get(s));
		}
		*/
	}
}