import java.util.*;

public class Exercise5_13 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		char tmp = ' ';			//단어의 알파벳을 섞기 위해 char형 빈 변수 생성
		
		for(int i = 0; i < words[i].length(); i++) {
			char[] question = words[i].toCharArray();	//String을 char형으로 반환
			
			int randomNum = (int)(Math.random() * words[i].length());	//단어의 길이만큼 섞어줄 랜덤넘버 생성
			tmp = question[i];					//question[i]가 television일 때 tmp에 t저장			
			question[i] = question[randomNum];	//television의 무작위 인덱스를 원래 t자리에 저장			
			question[randomNum] = tmp;			//t를 무작위 인덱스에서 나온 값이랑 바꿔줌
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.println("맞았습니다.\n\n");
			}
			else {
				System.out.println("틀렸습니다.\n\n");
			}
			
			
		}
	}
	

}
