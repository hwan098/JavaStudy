import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dZZZZ");
		set.add("dance");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range serch : from " + from + "to " + to);
		System.out.println("result1 : " + set.subSet(from, to));			// b~c까지 검색 --> subset()범위 검색
		System.out.println("result2 : " + set.subSet(from, to+"zzz"));		// b~d까지
	}

}
