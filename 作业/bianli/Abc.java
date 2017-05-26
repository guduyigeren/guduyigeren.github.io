public class Abc{
	public static void main(String [] args){
		String st ="ABCD";
		byte [] bys = st.getBytes();
		StringBuilder s = new StringBuilder("");
		for(byte b:bys){
			s.append((char)b).append(",");
		}
		s.deleteCharAt(s.length()-1);
		System.out.println(s.toString());
	}
}