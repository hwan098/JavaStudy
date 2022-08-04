import java.util.*;

public class FlowEx11 {

	public static void main(String[] args) {
		System.out.print("주민번호 입력(-포함)>>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("2000년 이전에 출생한 남자");
				break;
			case '3':
				System.out.println("2000년 이후에 출생한 남자");
				break;
			}
			break;  //중첩문이 끝났울 때 break문을 한 번 더 사용해준다.
		case '2': case '4':
			switch(gender) {
			case '2':
				System.out.println("2000년 이전에 출생한 여자");
				break;
			case '4':
				System.out.println("2000년 이후에 출생한 여자");
				break;
			}
			break;	//중첩문이 끝났울 때 break문을 한 번 더 사용해준다.
		default:
			System.out.println("유효하지 않은 주민번호");
	
		}
	}

}
