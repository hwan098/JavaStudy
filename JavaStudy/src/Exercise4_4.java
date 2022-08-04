
public class Exercise4_4 {

	public static void main(String[] args) {
		int sum = 0; 
		int m = 1; 
		int num = 0;

		for(int i=1;; i++, m=-m) { 
			num = m * i; 
			sum += num;
			
			if(sum >=100) {
				break;
			}
			
			}
		System.out.println("num: " + num);
		}
}
