class Exercise9_1 {
	public static void main(String[] args) {
		SutdCard c1 = new SutdCard(3,true);
		SutdCard c2 = new SutdCard(3,true);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
	}
}
class SutdCard {
	int num;
	boolean isKwang;
	SutdCard() {
		this(1, true);
	}
	SutdCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public boolean equals(Object obj) {
		
		return isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
