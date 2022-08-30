
public class Exercise9_9 {
	public static String delChar(String src, String delCh) {
		
		// src안에 delCh 있는지 확인
		
		int idx = 0;
		char[] arr;
		if(src.indexOf(delCh) == -1) {
			return src;
		}
		else {
			arr = src.toCharArray();
			for(int i=0; i<arr.length; i++) {
				
			}
			src = arr.toString();
			
		}
		return src;
		
		// src안에 delCh 지우기  
	}
		
		

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)"," \t"));
	}

	

}
