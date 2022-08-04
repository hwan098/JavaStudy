
public class Exercise4_14 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0; 

		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++; //횟수 세기
			System.out.print("1~100사이의 값을 입력하시오>>");
			input = s.nextInt();
			
			if(0<=input&&input<=100) {
				if(answer == input) {
					System.out.printf("정답입니다.\n시도횟수는 %d번입니다.\n", count);
					break;
					}
					else if(answer > input) {
					System.out.println("더 큰 수를 입력하세요.");
					}
				else if(answer < input) {
					System.out.println("더 작은 수를 입력하세요.");
					}
				}
			else {
				System.out.println("범위에 해당하지 않는 값입니다.");
				}
			}
		while(true);
		}

}
