//enum 클래스 메서드 사용(values(), ordinal())

public class EnumPrac2 {

	public static void main(String[] args) {
		//values() : enum에 선언된 상수를 전부 가져온다. (예제 출력을 위해 for문에 사용)
		for(Company type : Company.values()) {
			System.out.println(type.getValue());
		}
		//ordinal() : 해당 상수의 index값을 출력한다.
		System.out.println(Company.APPLE.ordinal());
	}

}
