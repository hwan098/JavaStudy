
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
// 자리 수 구하는 코드
// 12345
//1 -> 12345 / 10000
//2 -> 12345 / 1000 -> %10 -=2
//3 -> 12345 / 100 -> %10

//5
//5+10 + 4
//5*10 + 4*10 +3