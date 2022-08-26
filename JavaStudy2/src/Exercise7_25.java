//연습문제 7-25, 7-26 


//연습문제 7-25
/*
class Outer {
	class Inner {
		int iv=100;
	}
}

public class Exercise7_25 {

	public static void main(String[] args) {
		Outer o = new Outer();				//인스턴스 클래스의 인스턴스를 생성하려면 외부클래스의 인스턴스를 먼저 생성할 것
		Outer.Inner i = o.new Inner();
		System.out.println(i.iv);

	}

}
*/
//연습문제 7-26
class Outer {
	static class Inner {
		int iv=200;
	}
}

public class Exercise7_25 {

	public static void main(String[] args) {
		//Outer o = new Outer();				//외부클래스의 static멤버이므로 객체를 만들지 않아도 된다.
		Outer.Inner i = new Outer.Inner();
		System.out.println(i.iv);
		System.out.println(new Outer.Inner().iv);

	}

}