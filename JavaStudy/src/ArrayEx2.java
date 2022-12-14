import java.util.*;	//Arrays.toString 함수를 사용하기 위해 추가 

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		//int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random()*10) + 1;	//1~10의 랜덤값을 배열에 저장
		}
		
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ", ");	//배열에 저장된 값 출력
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));	//배열의 내용을 출력하려면 Arrays.toString(배열이름)
		System.out.println(Arrays.toString(iArr3)); 
		System.out.println(iArr3);	//배열의 주소값 출력
		System.out.println(chArr);	//println함수가 char배열일 때만 각 요소가 구분자없이 그대로 출력된다.
		
	}

}
