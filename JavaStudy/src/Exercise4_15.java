
public class Exercise4_15 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
	
		while(tmp != 0) {    //result를 number 반대로 만들기
			result = result * 10 + tmp % 10;    //1 = 0 + 1, 
			tmp /= 10;	//1232, 
			
		
		}
		
		if(number == result)
			System.out.println(number + "는 회문수입니다.");
		else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}

}
