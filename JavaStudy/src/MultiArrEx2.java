//bingo game

import java.util.*;

public class MultiArrEx2 {

	public static void main(String[] args) {
		final int SIZE = 5;	//리터럴 지정
		int x = 0 , y = 0, num = 0;  //랜덤값을 위해 변수 지정

		int[][] bingo = new int[SIZE] [SIZE]; //5*5 배열 생성 
		Scanner scanner= new Scanner(System. in) ; 
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;	//1~25까지 각 인덱스에 순차적으로 지정
			}	
		}
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x = (int)(Math.random()*SIZE);	//변수 x에 범위 5만큼의 랜덤값 지정
				y = (int)(Math.random()*SIZE);	//변수 y에 범위 5만큼의 랜덤값 지정
				
				int tmp = bingo[i][j];			//값을 바꾸기 위해 bingo와 같은 tmp변수 선언
				bingo[i][j] = bingo[x][y];		//랜덤 배열을 기존의 bingo배열에 저장
				bingo[x][y] = tmp;				//
				
			}
		}
		do {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) { 
					System.out.printf("%2d ", bingo[i][j]);
				}
				
				System.out.println();
			}
			System.out.println();
			System.out.printf("1 ~ %d의 숫자를 입력하세요.(종료:0)", SIZE*SIZE);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			outer:
				for(int i=0; i<SIZE; i++) {
					for(int j=0; j<SIZE; j++) {
						if(bingo[i][j] == num) {	//입력받은 num이 배열에 있는 값과 같다면
							bingo[i][j] = 0;		//0으로 바꾸고 
							break outer;			//이중 반복문을 나와 계속 진행한다. 
						}
					}	
				}	
			}
		while(num != 0);	//0을 입력하기 전까지 무한반복한다.
		}
}
