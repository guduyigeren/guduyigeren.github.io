import java.io.*;
public class OutputStreamDemo2{
	public static void main(String [] args) throws Exception{
		//�쳣�׳���������
		//��һ��ʹ��File���ҵ�һ���ļ�
		File f = new File("e:"+File.separator+"text.txt");//����File����
		//�ڶ�����ͨ������ʵ�����������
		OutputStream out = null; //׼�����������
		out = new FileOutputStream(f,true);//��ʾ���ļ�ĩβ׷������
		//��������д����
		String str = "Hello World��";//׼���ַ���
		byte b [] = str.getBytes();//ֻ�����byte���飬���Խ��ַ������byte����
		for(int i=0;i<b.length;i++){
			//ѭ��д��
			out.write(b[i]);//ÿ��ֻд��һ������
		}
		//4.�ر�������
		out.close();
	}
}