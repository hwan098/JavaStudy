/*
 * 중복된 값은 저장되지 않는 HashSet의 성질을 이용해 로또 번호 만들기
 * */

import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);

	}

}
