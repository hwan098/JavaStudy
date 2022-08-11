
public class Exercise5_8 {

	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
	
			for(int j = 0; j < counter.length; j++) {
				int randomNum = (int)(Math.random() * answer.length);
				
				StringBuffer star = new StringBuffer("*");	//String 더하는 함수 
				
				switch(answer[randomNum]) {
				case 2:
					star.append("*");	//*하나 추가
					break;
				case 3:
					star.append("**");
					break;
				case 4:
					star.append("***");	
				}
				System.out.printf("%d%s\n", answer[randomNum], star);
			
			
			}
	}

}
