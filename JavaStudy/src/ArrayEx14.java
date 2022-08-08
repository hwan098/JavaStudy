//charAt(), toCharArray()

public class ArrayEx14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "):" + ch );    //src의 i번째 문자를 ch에 저장
		}

		char[] chArr = src.toCharArray();	//String을 char[]로 반환한다.
		
		System.out.println(chArr);
		

	}

}
