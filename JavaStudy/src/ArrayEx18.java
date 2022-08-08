
public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
				
		};
		
		int sum = 0;
		
		for(int i=0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				System.out.printf("Score[%d][%d] = %d\n", i, j,score[i][j]);
			}
		}
		
		for(int[] tmp : score) {	//score의 1차원 배열 주소를 tmp에 저장
			for(int i : tmp) {	
				sum +=i ;
			}
		}
		
		System.out.println("sum = " + sum);
	
	}

}
