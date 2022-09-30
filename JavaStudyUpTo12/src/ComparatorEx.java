import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);	//대->소
		System.out.println("strArr = " + Arrays.toString(strArr)); 
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);	//대소문자 구분 없음
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); //역순으로 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}
class Descending implements Comparator{
	//역순으로 정렬하는 메서드
	/*
	 * 매개변수가 Object타입이기 때문에 compareTo()를 바로 호출할 수 없으므로 먼저 Comparable로 형변환해야한다.
	 * */
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
	
}

