//연습문제 7-17 공통부분을 뽑아서 클래스 생성하고 수정하기 

class Unit{
	int x, y;
	
	void move(int x, int y) {	
		this.x = x;
		this.y = y;
		System.out.printf("%d, %d로 이동합니다.\n", x, y);
	}
	void stop() {
		System.out.printf("정지.\n");
	}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.printf("Marine이 %d, %d로 이동합니다.\n", x, y);
	}
	void stimPack() {
		System.out.println("Marine이 스팀팩을 사용합니다.\n");
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.printf("Tank가 %d, %d로 이동합니다.\n", x, y);
	}
	void changeMode() {
		System.out.println("공격모드를 변환합니다.\n");
	}
}

class DropShip extends Unit{
	void move(int x, int y) {
		System.out.printf("DropShip이 %d, %d로 이동합니다.\n", x, y);
	}
	void load() {
		System.out.println("태웁니다.\n");
	}
	void unload() {
		System.out.println("내립니다.\n");
	}
}

public class Exercise7_17 {

	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		DropShip d = new DropShip(); 
		
		m.move(1, 2);
		m.stop();
		m.stimPack();
		t.move(5, 4);
		d.move(9, 1);
	}

}
