import java.io.*;
public class InputStreamDemo{
	public static void main(String [] args) throws Exception{
		//�쳣�׳���������
		//��һ��ʹ��File���ҵ�һ���ļ�
		File f = new File("e:"+File.separator+"text.txt");//����File����
		//�ڶ�����ͨ������ʵ�����������
		InputStream input = null; //׼�����������
		input = new FileInputStream(f);//ͨ������Ķ�̬�Խ���ʵ��������
		//��������д����
		
		byte b [] = new byte[1024];//�������ݶ�����byte������;
		input.read(b);//��ȡ����
		//4.�ر�������
		input.close();
		System.out.println("����Ϊ��"+new String(b));
		//��byte���ֱ���ַ������
	}
}