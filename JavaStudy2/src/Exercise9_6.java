
public class Exercise9_6 {
	
	public static String fillZero(String src, int length) {
		
		char[] charArr = new char[length]; //10
		char[]charArr2 = new char[src.length()];
		
		if(src==null || src.length()==length) { //src가 null이거나 length와 길이가 같으면 src반환
			return src;
		}
		else if(length <= 0) {
			return " ";
		}
		
		else if(length < src.length()) {	//
			for(int i=0; i<length; i++) {			
				charArr2[i] =  src.charAt(i);
			}
			String changeStr = new String(charArr2);
			return changeStr;
		}
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
