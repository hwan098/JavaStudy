
public class Exercise9_6 {
	
	public static String fillZero(String src, int length) {
		if(src == null || src.length() == length) {
			return src;
		}
		else if(length <= 0) {
			src = "";
			return src;
		}
		else if(src.length() > length) {
			src = src.substring(0, length);
			return src;
		}
		// 빈 칸
		else {
			char[] charArr = new char[length];
			char[] charArr2 = new char[length];
			
			
			for(int i=0; i<length; i++) {
				charArr[i] = '0';
			}
			for(int i=0; i<src.length(); i++) {
				charArr2[i] = src.charAt(i);
			}
			
			System.arraycopy(charArr2, 0, charArr, src.length(), src.length());
			String changeStr = new String(charArr);
			return changeStr;
		}	
	}



	public static void main(String[] args) {
		
		String src = "12345";
		
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
		
	}
}

/*for(int j=0; j<insertNum; j++) {
	charArr[j] = '0';					   //charArr[0] = '0' 
}


for(int j=inNum; j<charArr.length; j++) {
				for(int k=0; k<src.length(); k++) {
					charArr[inNum] = src.charAt(k);
				}	
			}
*/
/*
 * 



else if(length < src.length()) {	//
	for(int i=0; i<length; i++) {			
		charArr2[i] =  src.charAt(i);
	}
	String changeStr = new String(charArr2);
	return changeStr;
else {
	for(int i=0; i<charArr.length; i++) {			//배열의 각 인덱스에 0삽입
		charArr[i] = '0';
	}
	
	for(int i=0; i<charArr2.length; i++) {
		charArr2[i] =  src.charAt(i);
		int insertInNum = length-src.length();
		charArr[insertInNum + i] = charArr2[i];
	}
	
	String changeStr = new String(charArr);
	return changeStr;
}
*/