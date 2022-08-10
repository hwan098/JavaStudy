//shipBoard game

import java.util.*;

public class MultiArrEx1 {

	public static void main(String[] args) {
		final int SIZE = 10;    //리터럴 지정
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard =  { 
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }
			}; 
		
		for(int i=1; i < SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i + '0');
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("좌표입력(종료는 00)>>>");
			String input = scanner.nextLine();
			
			if(input.length() == 2) {	//두 글자를 입력한 경우
				x = input.charAt(0) - '0';	//문자를 숫자로 변환하려면 -'0'
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)	//00을 입력한 경우 종료
					break;
			}
			
			if(input.length() != 2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {	//입력한 내용이 두 자리수가 아니면 다시 입력
				System.out.println("다시 입력하세요.");
				continue;	//다시 입력하게 하기 위해서 프로그램을 빠져나가지 않게함.
			}
			if (shipBoard[x-1][y-1] == 1) {
				board[x][y] = 'O';
			}
			else {
				board[x][y] = 'X';
			}
			
			for(int i=0; i<SIZE; i++) {
				System.out.println(board[i]);
			System.out.println();
			}
		}

	}

}
