//연습문제 6-6(두 점 간의 거리 구하기)
public class Exercise6_6 {
	
	static double getDistance(int x, int y, int x1, int y1) {
		//return Math.sqrt(x1-x)*(x1-x) + (y1-y)*(y1-y); 
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); 
	}
	

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));


	}

}
