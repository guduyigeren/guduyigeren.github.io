import java.util.*;
public class HashMapDeom{
	public static void main(String [] args){
		//����HashMap����
		Map<String,String> hm = new HashMap<String,String>();
		//���ӳ��
		hm.put("1","xiaoming");
		hm.put("2","xiaoqiang");
		hm.put("3","xiaopang");
		hm.put("4","xiaofeng");
		//�Ƴ�ָ��ӳ��
		hm.remove("3");
		//�Ƴ�����ӳ��
		//hm.clear();
		//����ӳ��ָ��ֵ
		//hm.get("4");
		System.out.println(hm.get("4"));
		//����hmӳ��
		Set<String> k=hm.keySet();
		//������    ����
		Iterator it = k.iterator();
		while(it.hasNext()){
			String keys = (String)it.next();
			String h = hm.get(keys);
			System.out.println(keys+""+h);
		}
		/*
		  for - each ����
		for(String s:k){
			System.out.println(s+""+hm.get(s));
		}
		*/
	}
}