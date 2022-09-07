import java.util.*;
import java.text.*;


public class Exercise10_5 {
	
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		int dayDiff = 0;
		
		try {
			
			Date day1 = format.parse(yyyymmdd1);
			Date day2 = format.parse(yyyymmdd2);
			int sec = (int) ((day1.getTime() - day2.getTime()) / 1000);
			dayDiff = (int) sec / (24*60*60);
			
		} catch (Exception e) {
			dayDiff = 0;
		}
		
		
		return dayDiff;
	}

	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));


	}

}
