import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
		
		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("arr=" + Arrays.deepToString(arr2D)); // 모든 배열 출력
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);	//arr 요소 중 인덱스 2에서 3까지 불러와서 arr5에 저장
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);	//초과되는 인덱스는 값이 복사되지 않음
		
		
		
		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);	//각 인덱스에 9 넣기
		System.out.println("arr7=" + Arrays.toString(arr7));
		
		for(int i=1; i <= arr7.length; i++) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);
			System.out.println(graph);
		}
		
		String [][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String [][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));		//두 배열의 요소가 같은지 비교한다. equals:1차배열 
		System.out.println(Arrays.deepEquals(str2D, str2D2));	//deepEquals:2차배열
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B'));
		
		System.out.println("===== After Sorting =====");
		Arrays.sort(chArr);
		
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B'));	//binarySearch 사용 시 리스트를 먼저 정렬할 것
	}

}
