import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;


public class Exercise10_7 {

	public static void main(String[] args) {
		LocalDate day = LocalDate.of(2016, 10, 1);
		
		System.out.println(day);
		System.out.println(day.with(dayOfWeekInMonth(4, TUESDAY))); 
	}
}


