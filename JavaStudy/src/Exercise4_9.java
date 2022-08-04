
public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
	
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i)-'0';	//문자형을 정수형으로 바꾸려면 -'0'을 해줘야 한다.
			
		}
		
		System.out.println("sum = "+sum);
	}

}
