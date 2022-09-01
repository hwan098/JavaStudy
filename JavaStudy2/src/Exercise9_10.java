
public class Exercise9_10 {
	
	public static String format(String str, int length, int alignment) {
		
		char[] chArr = str.toCharArray();
		char[] chArr2 = new char[length];
		
		if(length < str.length()) {
			str =  str.substring(length);
		}
		else {
			switch(alignment) {
			case 0:
				System.arraycopy(chArr, 0, chArr2, 0, str.length());
			case 1:
				System.arraycopy(chArr, 0, chArr2, 2, str.length());	
			case 2:
				System.arraycopy(chArr, 0, chArr2, length-str.length(), str.length());
			}
		
				
		}
		// char 배열을 string으로 바꿔러
		str = String.valueOf(chArr2);
		return str;
}

	public static void main(String[] args) {
		String str = "가나다"; 
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬


	}

}
