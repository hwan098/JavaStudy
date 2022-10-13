
public class GenericPrac2 {

	public static void main(String[] args) {
		ClassName1<String, Integer> a = new ClassName1<String, Integer>();
		
		
		a.set("10", 10);
		
		
		System.out.println("first data: " + a.getFirst());
		System.out.println("k E type: " + a.getFirst().getClass().getName());
		System.out.println("==============================");
		System.out.println("second data: " + a.getSecond());
		System.out.println("v type: " + a.getSecond().getClass().getName());
		System.out.println("==============================");
		System.out.println("<T> returnType : " + a.genericMethod(123456).getClass().getName());
		System.out.println("<T> returnType : " + a.genericMethod("hahahahahaha").getClass().getName());
		System.out.println("<T> returnType : " + a.genericMethod(a).getClass().getName());

	}

}

class ClassName1<K, V>{
	private K first;
	private V second;
	
	void set(K first, V second) {
		this.first = first;
		this.second = second;
	}
	
	K getFirst() {
		return first;
	}
	V getSecond() {
		return second;
	}
	
	<T> T genericMethod(T o) {
		return o;
	}
	
}