//배열의 복사(arraycopy()함수 사용 하지 않고)

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];	//길이가 5인 arr배열 생성
		
		for(int i = 0; i < arr.length; i++) {	//arr배열에 1~5까지 값을 넣어줌	
			arr[i] = i + 1;
		}

		System.out.println("[변경 전]");
		System.out.println("arr.length: " + arr.length);	//tmp로 값을 복사하기 전 arr의 길이와 인덱스 별 값 확인
		for(int i = 0; i < arr.length; i ++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}
		
		int[] tmp = new int[arr.length*2];	//배열 arr의 두 배 길이를 가진 tmp배열 생성
		
		for(int i = 0; i < arr.length; i++) {	//arr배열의 각 인덱스 값을 tmp에 저장
			tmp[i] = arr[i];
		}
		
		arr = tmp;	//tmp에 저장된 값을 arr에 저장
		
		System.out.println("[변경 후]");
		System.out.println("arr.length: " + arr.length);
		for(int i = 0; i < arr.length; i ++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}
		
	}

}
