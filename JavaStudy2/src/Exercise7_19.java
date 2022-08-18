//????
public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0;
	
	void buy(Product p) {
		if(money >= p.price) {
			money -= p.price;
			add(p);
		}
		else {
			System.out.println("잔액부족");
		}
	}
	
	void add(Product p) {
		for(int i=0; i<cart.length; i++) {
			if(i >= cart.length) {								//1.1
				Product[] newCart = new Product[cart.length*2];	//1.1.1
				newCart = cart;									//1.1.2
				this.cart = newCart;							//1.1.3
				cart[i] = p;									//1.2
				this.i++;										//1.2
			}
			else {
				return;
			}
		}
	}
	
	void summary() {
		String itemList = "";
		int totalPrice = 0;
		
		for(int i=0; i<this.cart.length; i++) {
			itemList += cart[i] + ",";
			totalPrice += cart[i].price;
		}
		System.out.printf("구입한 물건: %s", itemList);
		System.out.printf("사용한 금액: %d", totalPrice);
		System.out.printf("사용한 금액: %d", money - totalPrice);
	}
}

class Product {
	int price; // 제품의 가격
	
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100); 
	}
	public String toString() {
		return "Tv"; 
	}
}

class Computer extends Product {
	Computer() {
		super(200); 
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50); 
	}
	public String toString() {
		return "Audio"; 
	}
}

