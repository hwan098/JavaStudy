//배열 90도 돌리기?

public class Exercise5_9 {

	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' ' },
				{'*', '*', ' ', ' ', ' ' },
				{'*', '*', '*', '*', '*' },
				{'*', '*', '*', '*', '*' }
		};
		char[][] result = new char[star[0].length][star.length]; //4,3
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				int a = j;
				int b = star.length-1-i;//열의 수가 1칸 작기 때문에 star.length-1해주고 반복문을 중첩반복문을 벗어날 때 i가 하나씩 커지니까  
				
				result[a][b] = star[i][j];
			}
		}
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}

//for로 배열을 어디서부터 어떻게 읽을지
//탐색하고 어디서 넣어야할지가 중요함