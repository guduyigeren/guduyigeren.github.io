import java.util.*;
public class TreeSetDeom{
	public static void main(String [] args){
		//����TreeSet����
		Set<String> ts = new TreeSet<String>();
		//���Ԫ��
		ts.add("aa");
		ts.add("ac");
		ts.add("ab");
		ts.add("ae");
		//�Ƴ�һ��ָ��Ԫ��
		ts.remove("ae");
		//�Ƴ�����Ԫ��
		//ts.clear();
		//����ָ��Ԫ�صĸ���
		//ts.size();
		System.out.println("ָ��Ԫ�صĸ�����"+ts.size());
		//������   ����
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*
			for - each ����
		for(String s:ts){
			System.out.println(s);
		}
		*/
	}
}