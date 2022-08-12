
public class Exercise5_7
{
public static void main(String args[]) {
	if(args.length != 1) {
		System.out.println("USAGE: java Exercise5_7 3120");
		System.exit(0);
	}
	
	int money = Integer.parseInt(args[0]);
	
	System.out.println("money = " + money);
	
	int[] coinUnit = {500, 100, 50, 10};
	int[] coin = {5, 5, 5, 5};
	
	for(int i = 0; i < coinUnit.length; i++) {
		int coinNum = 0;
		
		coinNum = money / coinUnit[i];    //6 = 3120 / 500
		
		if(coin[i] >= coinNum) {	//필요한 코인보다 coin의 개수가 더 많거나 같으면 
			coin[i] -= coinNum;		//가지고 있는 코인을 뺀 다.
		}
		else{
			coinNum = coin[i];		//필요 코인 보다 가지고 있는 코인 개수가 적으면
			coin[i] = 0;			//코인 개수를 0으로
		}
		money -= (coinNum * coinUnit[i]);	//금액에서 동전의 개수와 동전단위를 곱한 값을 뺀다.
		System.out.println(coinUnit[i]+"원 : " + coinNum); 
	
	}
	if(money > 0) {
		System.out.println("거스름돈이 부족합니다.");
		System.exit(0);
	}
	System.out.println("==남은 동전의 개수==");
	
	for(int i = 0; i < coinUnit.length; i++) {
		System.out.println(coinUnit[i]+"원 : " + coin[i]); 
	}
}




















/*{
	if(args.length != 1) {
		System.out.println("USAGE: java Exercise5_7 3120");
		System.exit(0);
	}

	int money = Integer.parseInt(args[0]);
	
	System.out.println("money = " + money);
	
	int[] coinUnit = {500, 100, 50, 10 }; 
	int[] coin = {5, 5, 5, 5}; 
	
	for(int i = 0; i < coinUnit.length; i++) {
		int coinNum = 0;
		coinNum =  money / coinUnit[i];	
			
		if(coin[i] <= coinNum) {
			coin[i] -= coinNum;
		}
		else{
			coinNum = coin[i];
			coin[i] = 0;
		}
		money -= coinNum * coinUnit[i];
		System.out.println(coinUnit[i]+"원 : " + coinNum); 
	}
	
	if(money > 0) {
		System.out.println("거스름돈이 부족합니다."); 
		System.exit(0); 
	}
	
	System.out.println("=남은 동전의 개수="); 
	
	for(int i=0;i<coinUnit.length;i++) {
		System.out.println(coinUnit[i]+"원: " + coin[i]); 
	}
	} */
}
