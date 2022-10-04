import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		//배열 score의 값들을 트리셋 set에 넣어줌--> 자동정렬됨
		for(int i=0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println("TreeSet : " + set);
		System.out.println("bigger than 50 : " + set.tailSet(new Integer(50)));
		System.out.println("lower than 50 : " + set.headSet(new Integer(50)));
	}

}
