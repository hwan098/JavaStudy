//연습문제7_1 배열 SutdaCard 초기화하기

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=1; i < cards.length/2; i++) {
			boolean isKwang = (i==1 || i==3 || i==8);
			cards[i] = new SutdaCard(i,isKwang);
		}
		for(int i=10; i < cards.length; i++) {
			cards[i] = new SutdaCard(i-10, false);
		}
		
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);	
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;	
	}
	
// info() Object toString() . 대신 클래스의 을 오버라이딩했다
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
	}
}
