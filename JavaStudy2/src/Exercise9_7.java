
public class Exercise9_7 {
	
	public static boolean contains(String src, String target) {
		if(src.contains(target) == true) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));

	}

}
