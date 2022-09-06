import java.util.*;
import java.text.*;


public class Exercise10_4 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dayOfTheWeek;
		dayOfTheWeek = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		Date inputDate = null;
	
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(ex)2022/09/05)");
		
		while(scanner.hasNextLine()) {
			try {
				inputDate = df.parse(scanner.nextLine());
				break;
			}
			catch(Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(ex)2022/09/05)");
			}
		}
		
		System.out.println(dayOfTheWeek.format(inputDate));

	}

}
