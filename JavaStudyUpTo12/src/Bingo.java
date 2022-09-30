import java.util.*;

public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet();
		//Set set = new LinkedhashSet();
		int [][] board = new int [5][5];
		
		for(int i=0; set.size() < 25; i++) {
			set.add((int)(Math.random()*50) + 1 + "");
		}
		
		Iterator it = set.iterator();
		 
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				if(board[i][j] < 10) {
					System.out.print(board[i][j]);	
				}
				else {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			
		}
	}

}
