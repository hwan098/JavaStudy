
public class ArrayEx4 {

	public static void main(String[] args) {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);	//char 배열은 print문으로도 배열의 내용을 출력할 수 있다.
		System.out.println(num);

		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);	//abc[0]에서 result[0]으로 abc길이 만큼의 데이터를 복사 
		System.arraycopy(num, 0, result, abc.length, num.length);	//num[0]에서 result[abc.length]로 num길이 만큼의 데이터를 복사  
		System.out.println(result);	//abcd456789
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
