//연습문제 7-27

class Outer1 {
	int value=10;
	
	class Inner1 {
		int value=20;
		
		void method1() {
			int value=30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer1.this.value);
		}
	} // Inner클래스의 끝
}
public class Exercise7_27 {

	public static void main(String[] args) {
		Outer1 o = new Outer1();				//인스턴스 클래스의 인스턴스를 생성하려면 외부클래스의 인스턴스를 먼저 생성할 것	
		Outer1.Inner1 inner = o.new Inner1();
		
		inner.method1();


	}

}
