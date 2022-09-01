
public class Exercise9_9 {
	public static String delChar(String src, String delCh) {
	
		StringBuffer str = new StringBuffer(src.length());
		str.append(src);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != -1) {
				str.deleteCharAt(i);
			}
			else {
				return src;
			}
		}
		src = str.toString();
		return src;
	}
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)"," \t"));
	}
}
