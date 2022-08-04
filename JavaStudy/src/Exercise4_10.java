
public class Exercise4_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num>0) {	//12345를 10씩 나누기 위함
			sum += num % 10;	//12345를 10으로 나눴을 때 나머지가 5이므로 낮은 자리부터 sum에 더한다.
			num /= 10;	//다음 자리로 가기 위해서 10을 또 나눠준다.
		}
	
		
		System.out.println("sum = "+sum);
	}

}
