//연습문제7_1, 2 배열 SutdaCard 초기화하기
//Q

class SutdaDeck {
	final int CARD_NUM = 20;									//카드의 개수는 20개 고정 
	SutdaCards[] cards = new SutdaCards[CARD_NUM];				//객체배열 생성
	
	SutdaDeck() {
		for(int i=1; i <= (cards.length/2); i++) {				// 섯다카드 20장을 담는 배열 초기화(0~9인덱스)
			boolean isKwang = (i==1 || i==3 || i==8);			//1, 3, 8 둘 중에 한 장은 kwang
			cards[i-1] = new SutdaCards(i, isKwang);
		}
		for(int i=11; i <= cards.length; i++) {					//10~19인덱스 초기화
			cards[i-1] = new SutdaCards(i-10, false);			//1, 3, 8 둘 중에 한 장만 kwang=true이므로 해당 반복문에서는 false 
		}	
	}
	 void shuffle(){											//반환할 값이 없으므로 void
		for(int i=0; i<cards.length; i++) {
			int randomNum = (int)(Math.random()*cards.length);
			SutdaCards tmp;										//int 형이 아닌 왜 SutdaCards tmp가 되어야 하는지--> int tmp일 때 실행이 안됐다.
			tmp = cards[i];
			cards[i] = cards[randomNum];
			cards[randomNum] = tmp;
			
		}
	}
	 SutdaCards pick(int index) {
		 return cards[index];	
	}
	 SutdaCards pick() {
		 int randomNum = (int)(Math.random()*cards.length);
		 return cards[randomNum];
	}
	
}

class SutdaCards {		
	int num;			//멤버변수
	boolean isKwang;	//멤버변수
	
	SutdaCards() {		//매개변수가 0개인 생성자
		this(1, true);	//생성자가 안에서 다른 생성자를 호출, SutdaCards(int num, boolean isKwang) 
						//매개변수가 없는 sutdacard() 호출하면 SutdaCards(int num, boolean isKwang)를 호출하고
						//초기값을 넣어줌
	}
	
	SutdaCards(int num, boolean isKwang) {
		this.num = num;	//객체 자신에 대한 레퍼런스 변수. 멤버변수를 나타냄
		this.isKwang = isKwang;	
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();	//SutdaDeck(붕어빵 틀), deck(붕어빵)
		
		System.out.println(deck.pick(0));	//SutdaDeck의 인스턴스인 deck의 pick(index)호출 
		System.out.println(deck.pick());	//SutdaDeck의 인스턴스인 deck의 pick()호출    -->pick()은 오버로드됨
		deck.shuffle();

		
		for(int i=0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));

	}
}
