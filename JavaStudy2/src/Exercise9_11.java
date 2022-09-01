import java.util.*;

public class Exercise9_11 {

	public static void main(String[] args) {
		System.out.print("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
	
		if(!(2 <= num1 && num1 >= 9 && 2 <= num2 && num2 >= 9)) {
			for(int i=num1; i <= num2; i++) {
				System.out.println();
				for(int j=1; j <= 9; j++) {
					System.out.printf("%d*%d=%d\n", i, j, i*j);
				}
			}
		}
		else {
			System.out.println("단의 범위는 2 ~ 9의 값이어야 합니다.");
		}
	}
}
