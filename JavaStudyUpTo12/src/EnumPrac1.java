//enum 상수와 연결된 값 가져오기

public class EnumPrac1 {
	

	public static void main(String[] args) {
		for(Company type : Company.values()) {
			System.out.println(type.getValue());
		}
			
		System.out.println(Company.APPLE.getValue());

	}

}
