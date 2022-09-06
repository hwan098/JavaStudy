import java.util.*;
import java.text.*;

public class Exercise10_2 {
	
	static int paycheckCount(Calendar from, Calendar to) {
		int monDiff = 0;
		
		if(from.get(Calendar.YEAR) <= to.get(Calendar.YEAR)) {
			if(from == null || to == null) {
				monDiff = 0;
			}
			else if(from == to && from.get(Calendar.DATE) == 21 && to.get(Calendar.DATE) == 21) {
				monDiff = 1;
			}
			else {
				monDiff = to.get(Calendar.MONTH) - from.get(Calendar.MONTH);
				if(monDiff < 0) {
					return 0;
				}
				if(from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >= 21) {
					monDiff++;
				}
				else if(from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21) {
					monDiff--;
				}
			}
		}

		return monDiff;
	}

	
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
		System.out.println(paycheckCount(from, to));
	}

	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		fromCal.set(2010,0,1);
		toCal.set(2010,0,1);
		printResult(fromCal, toCal);
		fromCal.set(2010,0,21);
		toCal.set(2010,0,21);
		printResult(fromCal, toCal);
		fromCal.set(2010,0,1);
		toCal.set(2010,2,1);
		printResult(fromCal, toCal);
		fromCal.set(2010,0,1);
		toCal.set(2010,2,23);
		printResult(fromCal, toCal);
		fromCal.set(2010,0,23);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
		fromCal.set(2011,0,22);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
	}
}
