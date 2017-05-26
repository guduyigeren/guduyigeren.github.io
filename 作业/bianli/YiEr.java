public class YiEr{
	public static void main(String [] args){
		String st = "123";
		byte[] bt = st.getBytes();
		StringBuilder s = new StringBuilder("");
		for(byte b : bt){
			s.append((char)b).append(",");
		}
		s.deleteCharAt(s.length()-1);
		System.out.println(s.toString());
	}
}