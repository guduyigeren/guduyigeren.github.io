import java.util.*;
public class HashSetDeom{
	public static void main(String [] args){
		//����HashSet����
		Set<String> ha = new HashSet<String>();
		//���Ԫ��
		ha.add("aa");
		ha.add("da");
		ha.add("ca");
		ha.add("bd");
		//Ԫ����ͬʱ��ʱ�Ḳ����ʱ����ʾ
		//ha.add("aa");
		//�Ƴ�ָ����һ��Ԫ��
		ha.remove("da");
		//�Ƴ�����Ԫ��
		//ha.clear();
		//��ѯָ��Ԫ�صĸ���
		//ha.size();
		System.out.println("ָ��Ԫ�صĸ���"+ha.size());
		//������   ����
		Iterator it = ha.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*
			for - each  ����
		for(String s:ha){
			System.out.println(s);
		}
		*/

	}
}