//연습문제 6-1, 6-2

public class Exercise6_1 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){	//매개변수가 없을 때 
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){	//둘 다 static이 아니므로 this를 이용해 생성자를 만듦
		this.num = num;
		this.isKwang = isKwang;
	}
	String info() {
		if(isKwang == true) {	
			return num + "K";
		}
		else {
			return  num + "";
		}
	}
	
}
