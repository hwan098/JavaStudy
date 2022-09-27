import java.util.*;

class Exercise11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list); 
		TreeSet tset = new TreeSet(set);
		Stack stack = new Stack();
		stack.addAll(tset);
		
		while (!stack.empty())
			System.out.println(stack.pop());
	}
}


/*
 hash는 중복허용x --> 2637
 tset은 오름차순 정렬 저장--> 2367
 stack은 선입후출 --> 7632
 */
 