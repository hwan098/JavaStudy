
public class Exercise5_3 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {	//배열 arr의 길이만큼 반복
			sum += arr[i];						//sum에 각 인덱스 값들을 더함
		}
		
		System.out.println("sum = " + sum);
	}

}
