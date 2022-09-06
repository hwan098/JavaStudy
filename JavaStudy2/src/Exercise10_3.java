import java.text.*;
//import java.util.*;


public class Exercise10_3 {

	public static void main(String[] args) {
		String text = "123,456,789.5";
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,####");
		Number num;
		try {
			num = df.parse(text);
			double d = num.doubleValue();
			System.out.println("data: " + df.format(d));
			System.out.println("반올림: " + Math.round(d));
			System.out.println("만단위: " + df2.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
