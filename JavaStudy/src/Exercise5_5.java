// 배열 섞기
public class Exercise5_5 {

	public static void main(String[] args) {
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		int num = 0;
	    int tmp = 0;
	    
		for(int i = 0; i < ballArr.length; i++) {
			num = (int)(Math.random() * ballArr.length);	//랜덤 값
			tmp = ballArr[i];			//tmp에 ballArr배열 값 담기-->tmp = 1
			ballArr[i] = ballArr[num];	//예를 들어 랜덤한 인덱스가 4라고 했을 때 ballArr[0]에 5를 줌
			ballArr[num] = tmp;			//인덱스4가 값이 바뀌지 않았으므로 tmp값을 인덱스 4에 집어넣음 따라서 최종적으로 0<->4번째 인덱스끼리 값이 바뀌는 것
		}
		System.arraycopy(ballArr,0, ball3, 0, 3);    // 랜덤값으로 이루어진 ballArr의 0~2인덱스를 ball3[0]에 저장
		for(int j = 0; j < ball3.length; j++) {
			System.out.print(ball3[j]);	
		}
		
		
	
		}
	
		
	}


