
public class Exercise5_8 {

	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
	
			for(int j = 0; j < counter.length; j++) {
				int randomNum = (int)(Math.random() * answer.length);
				
				StringBuffer star = new StringBuffer("*");	//String 더하는 함수 
				
				switch(answer[randomNum]) {
				//case 1도 추가하는게 가독성이 좋다.
				case 2:
					star.append("*");	//*하나 추가
					break;
				case 3:
					star.append("**");
					break;
				case 4:
					star.append("***");	
				}
				System.out.printf("%d%s\n", answer[randomNum], star.toString());
			
			
			}
	}

}
//1. 배욜 끝까지 돌면서 1234 몇 개 있는지 확인
//2. 체크ㅡ한 내용을 담은 배열 하나 생성해서 저장
//그거 별로 저장
