
public class GenericPrac1 {

	public static void main(String[] args) {
		ClassName<String> a = new ClassName<String>();
		ClassName<Integer> b = new ClassName<Integer>();
		
		a.set("10");
		b.set(10);
		
		System.out.println("a data: " + a.get());
		System.out.println("a E type: " + a.get().getClass().getName());
		System.out.println("==============================");
		System.out.println("b data: " + b.get());
		System.out.println("b E type: " + b.get().getClass().getName());

	}

}

class ClassName<E>{
	private E element;
	
	void set(E element) {
		this.element = element;
	}
	
	E get() {
		return element;
	}
}