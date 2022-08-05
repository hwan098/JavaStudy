
public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
	
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i)-'0';	//CharAt으로 추출한 숫자형 문자는 char형이므로 int형으로 변환 시 아스키코드로 변환된다.
			 							// 1이 나오게 하려면 아스키코드로 '0'은 48을 빼준다. '1'(49) - '0'(48)
		}
		
		System.out.println("sum = "+sum);
	}

}
