
public class Exercise5_4 {

	public static void main(String[] args) {
		int[][]arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10}, 
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};

		int total = 0;
		float average = 0;
		float count = 0;	//인덱스의 개수를 세기 위해 count변수 생성, 소수점으로 나와야 하므로 float형으로 정의
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {	
				total += arr[i][j];		//모든 인덱스의 값들을 순차적으로 total에 더함
				count += 1;				
			}
		}
		
		average = total / count;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}

}
