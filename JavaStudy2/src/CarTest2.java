class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("Black", "Auto", 4);	//기본값
	}
	Car(String color){
		this(color, "Auto", 4);    //생성자간의 호출에는 생성자 이름 대신 this를 사용해야 함
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Blue");
		System.out.println(c1.color);
		System.out.printf("c1-->%s, %s, %d\n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2-->%s, %s, %d\n", c2.color, c2.gearType, c2.door);
		System.out.println(c1.door);
	}

}
