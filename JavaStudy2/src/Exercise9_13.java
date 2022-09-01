//??

import java.util.*;

public class Exercise9_13 {

	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		
		System.out.print("key입력: ");
		Scanner scanner = new Scanner(System.in);
		String key = scanner.next();
		
		System.out.println(src);
		System.out.printf("%s를 " + stringCount(src, key) +"개 찾았습니다.", key ); 

	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if (key == null || key.length() == 0) {
			return 0;
		}
		else {
			index = src.indexOf(key, pos);
			for(int i=0; i<key.length(); i++) {
				if(index == -1) {
					return count;
				}
				else {
					count++;
					pos = index + key.length();
				}
			}
		}
		return count;
	}

}
