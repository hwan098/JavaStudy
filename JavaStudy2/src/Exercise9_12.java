//?

public class Exercise9_12 {
	
	public static int getRand(int from, int to) {
		
		int randomNum = 0;
		 
		if(from > to) {
			randomNum = to + (int)(Math.random() * from);
		}
		else if(from < to) {
			randomNum = from + (int)(Math.random() * to);
		}
		else {
			return from;
		}
		return randomNum;
	}
	public static void main(String[] args) {
		for(int i=0; i< 20; i++)
			System.out.print(getRand(1,-3)+",");
			
			

		
	}

}
