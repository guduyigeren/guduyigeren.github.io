import java.io.*;
public class InputStreamDemo4{
	public static void main(String [] args) throws Exception{
		//�쳣�׳���������
		//��һ��ʹ��File���ҵ�һ���ļ�
		File f = new File("e:"+File.separator+"text.txt");//����File����
		//�ڶ�����ͨ������ʵ�����������
		InputStream input = null; //׼�����������
		input = new FileInputStream(f);//ͨ������Ķ�̬�Խ���ʵ��������
		//��������д����
		
		byte b [] = new byte[1024];//�������ݶ�����byte������;
		int len = 0;
		int temp = 0;//����ÿһ����ȡ����������
		while((temp=input.read())!=-1){
			//��ʾ���������ļ�û�ж���
			b[len] = (byte)temp;
			len++;
		}
		//4.�ر�������
		input.close();
		System.out.println("�������ݳ��ȣ�"+len);
		System.out.println("����Ϊ��"+new String(b,0,len));
		//��byte���ֱ���ַ������
	}
}