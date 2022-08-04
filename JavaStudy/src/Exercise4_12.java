// *
public class Exercise4_12 {

	public static void main(String[] args) {
		for(int i = 1; i<=9; i++) {
			System.out.println();
			for(int j=1; j<4; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0? 3 : i%3;
				
				System.out.printf("%d * %d = %d\t", x, y, x*y);
				
			}
			
		}

	}
}