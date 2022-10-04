import java.util.*;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size() < 6;) {					//size() --> 저장된 객체의 수 반환
			int num = (int)(Math.random()*45 + 1);
			set.add(num);
		}
		System.out.println(set);
	}

}
