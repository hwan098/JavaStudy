import java.util.*;

class Exercise11_10_2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1+ "");
		}
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list);
		Iterator it = list.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
	} 
}

/*
 * hashSet은 중복을 허용하지 않고 순서를 유지하지 않는다. --> 한 숫자가 고정된 위치에 저장된다
 * 따라서 리스트를 만들어 리스트에 데이터를 옮겨닮고 셔플을 이용해서 순서를 섞는다.
 */