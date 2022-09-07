import java.time.*;
import java.time.temporal.ChronoField;
public class Exercise10_8 {

	public static void main(String[] args) {
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime newyorkTime = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(newyorkTime);
		
		ZoneId korId = ZoneId.of("Asia/Seoul");
		ZonedDateTime korTime = ZonedDateTime.now().withZoneSameInstant(korId);
		
		System.out.println(korTime);
		
		int sec1 = newyorkTime.get(ChronoField.OFFSET_SECONDS);
		int sec2 = korTime.get(ChronoField.OFFSET_SECONDS);
		int diff = Math.abs(sec1 - sec2)/60/60;
		
		System.out.println("sec1 = " + sec1);
		System.out.println("sec2 = " + sec2);
		System.out.println("diff = " + diff + " hrs");
		
	}

}
