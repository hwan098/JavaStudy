
public class Exercise5_10 {

	public static void main(String[] args) {
		char[] abcCode = 
			{
					'`', '~', '!', '@', '$', '%', '^', '&', '*', 
					'(', ')', '-', '_', '+', '=', '|', '[', ']', '{', 
					'}', ';', ':', ',', '.', '/'
					
			};
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src = "abc123";
		String result = "";
		
		for(int i = 0; i < src.length(); i++) {
			char ch  = src.charAt(i);
			char tmp1 = 'a';
			char tmp2 = '0';
			if('a' <= ch && ch <= 'z') {	//src에서 뽑아온 문자가 아스키코드 'a'~'z'안에 있으면 
				int num1 = ch - tmp1;		//'a'는 아스키 코드로 97이다 입력받은 알파벳의 아스키코드 - 97
				result += abcCode[num1];	//result에 값을 저장 
			}
			else if('0' <= ch && ch <= '9'){
				int num2 = ch - tmp2;
				result += numCode[num2];
			}
		}
		
		System.out.println("src: " + src );
		System.out.println("result: " + result);

	}

}
