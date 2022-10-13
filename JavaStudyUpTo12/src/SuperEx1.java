class ParentA{
	int a = 10;
}

class ChildA extends ParentA{
	int a = 20;
	
	void display(int a) {
		//인스턴스에 접근
		System.out.println(a);
		
		//자식클래스에 접근
		System.out.println(this.a);
		
		//부모클래스에 접근
		System.out.println(super.a);
		
		
	}
}

public class SuperEx1 {

	public static void main(String[] args) {
		ChildA ch = new ChildA();
		ch.display(5);

	}

}
