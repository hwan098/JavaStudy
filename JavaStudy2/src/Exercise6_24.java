//연습문제 6-24 (절대값 반환하기)
public class Exercise6_24 {
	
	static int abs(int value) {
		if(value <= 0) {
			value -= value*2;
		}
		else {
			value = value;
		}
		return value;
	}

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 :" + abs(value)); 
		value = -10;
		System.out.println(value + "의 절대값 :"+abs(value));

	}

}
