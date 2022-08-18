//연습문제7-22번(도형클래스 추가하기)
abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));	
	}
	Shape(Point p) {
		this.p = p;
	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
		Point getPosition() {
			return p;
		}
	void setPosition(Point p) {
		this.p = p;
	}	
}
class Point {
	int x;
	int y;
	Point() {
		this(0, 0);
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "[" + x + ", " + y + "]";
		}
}

class Circle extends Shape{
	double r;
}

class Ractangle extends Shape{
	double whidth;
	double height;
	
	boolean isSquare() {
		if(//정사각형이면)// true
	}
}


public class Exercise7_22 {

	public static void main(String[] args) {
		

	}

}
