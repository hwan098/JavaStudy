// 버블정렬
public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));   //랜덤으로 각 인덱스에 값 지정
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length - 1; i++) { //비교하기 위해 만든 반복문
			boolean changed = false; //자리가 바뀜 false
			
			for(int j = 0; j < numArr.length-1-i; j++) {	//9번째 인덱스 - 0번째 인덱스 --> 다 비교해볼때까지 돌리는 반복문
				if(numArr[j] > numArr[j+1]) {	//만약 0번째 인덱스의 값이 1번째 인덱스 값보다 크다면
					int temp = numArr[j];	// temp변수에 0번째 값 저장
					numArr[j] = numArr[j+1];	//1번째 값을 0번째 값으로 지정
					numArr[j+1] = temp;	// temp변수에 옮겨놓았던 0번째 값을 1번째 값으로 지정
					changed = true;	//자리가 바뀌었음 true
					}
				}
			if(!changed) break;	//자리가 바뀌지 않았다면 정렬이 끝난 것이므로 비교를 끝낸다.
			
			for(int k = 0; k < numArr.length; k++) {	//
				System.out.print(numArr[k]);
				}
	System.out.println();
			}

		}
	}
