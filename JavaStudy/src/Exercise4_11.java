
public class Exercise4_11 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + "," + num2);
		
		for(int i = 0; i < 8; i++ ) {
			num3 = num1 + num2;    //2=1+1, 3=1+2, 5=2+3
			System.out.print("," + num3);	//2출력, 3출력, 5출력
			num1 = num2;	//1, 2, 3
			num2 = num3;	//2, 3, 5
			
					
			
		}
	}
	
}
