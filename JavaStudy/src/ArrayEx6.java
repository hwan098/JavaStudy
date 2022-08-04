
public class ArrayEx6 {

	public static void main(String[] args) {
		int[] score = {79, 89, 91, 33, 100, 55, 95};
		
		int max = score[0]; //비교 시 고정될 인덱스 지정
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {	//배열 score를 길이만큼 돌린다.
			if(score[i]>max) {	//i=1일때 79보다 89가 더 크기 때문에 89를 max에 저장해준다. 
				max = score[i];
			}
			else if(score[i]<min) {
				min = score[i];
			}
		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
