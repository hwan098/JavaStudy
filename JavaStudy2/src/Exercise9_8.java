
public class Exercise9_8 {
	public static double round(double d, int n) {
		double result = 0.0;
		double decimalPoint = 0.0;
		
		decimalPoint = Math.pow(10, n);
		result =  Math.round(d*decimalPoint) / decimalPoint;
		
		return result;
		
	}

	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));


	}

}
