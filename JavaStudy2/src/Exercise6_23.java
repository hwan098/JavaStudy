//연습문제 6-23 (배열 값 중 제일 큰 값 반환하기)

import java.util.*;

public class Exercise6_23 {
	  static int max(int[] arr) {
		  int max = 0;
		 if(arr == null || arr.length == 0) {
			 return -999999;
		 }
		 else {
			 Arrays.sort(arr);
			 max = arr[arr.length-1];
		 }
		 return max;
	  }
	public static void main(String[] args) {

		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: "+ max(data)); 
		System.out.println("최대값 :"+ max(null)); 
		System.out.println("최대값 :"+ max(new int[]{})); // 0 최대값 크기가 인 배열
	}

}
