
public class Exercise5_6 {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			 int num = money / coinUnit[i];	
			 money =  money % coinUnit[i];		//180 = 2680 mod 500 
			 
			 System.out.printf("%d원 : %d개\n", coinUnit[i], num);
		}

	}

}
