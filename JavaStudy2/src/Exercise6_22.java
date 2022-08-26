//연습문제 6-22 (문자열이 숫자인지 확인하기)

public class Exercise6_22 {
	static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
/*
 
 * */
		
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+" 숫자? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+" 숫자? "+isNumber(str));

	}

}
