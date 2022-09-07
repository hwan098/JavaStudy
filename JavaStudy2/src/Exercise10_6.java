import java.time.*;
import java.time.temporal.*;


public class Exercise10_6 {

	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(2000, 1, 1); // 자신의 생일을 지정
		LocalDate now = LocalDate.now();
		long days = birthDay.until(now, ChronoUnit.DAYS);

		System.out.println("Birth day = " + birthDay);
		System.out.println("today     = " + now);
		System.out.println(days + " days");
	}

}
