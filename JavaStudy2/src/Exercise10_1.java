import java.util.*;
//import java.text.*

public class Exercise10_1 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2010, 0, 1);
		
		for(int i=0; i < 12; i++) {
			date.add(Calendar.MONTH, 0);
			
			for(int j=0; j < date.getActualMaximum(Calendar.DATE); j++) {
				date.add(Calendar.DATE, 1);
				
				if(date.get(Calendar.WEEK_OF_MONTH) == 3 && date.get(Calendar.DAY_OF_WEEK) == 1) {
					System.out.println(toString(date) + "은 두번째 일요일입니다."); 
				 }
			}
		}
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
	}
	
	
}


