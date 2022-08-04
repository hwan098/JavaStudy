
public class ArrayEx7 {

	public static void main(String[] args) {
		int [] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);    //0~9 순서대로 i(숫자)가 바뀔 때 마다 출력
		}
		System.out.println();
		
		for(int i=0; i < 10; i++) {
			int n = (int)(Math.random()*10);
			
			int tmp = numArr[0];	//0번째 인덱스 값을 tmp에 저장
			numArr[0] = numArr[n];	//3번째 인덱스 값을 0번째 인덱스에 저장
			numArr[n] = tmp;	//tmp값을 3번째 인덱스에 저장
		}
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);    //0~9 순서대로 i(숫자)가 바뀔 때 마다 출력
	}

	}
}