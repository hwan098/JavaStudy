
public class Exercise6_5 {

	public static void main(String[] args) {
		Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());

	}

}

class Student1{
	
	String name;	//학생이름
	int ban, no, kor, eng, math;	//반, 번호, 국어점수, 영어점수, 수학점수
	
	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		float average = ((kor + eng + math) / 3f) * 10;
		float result = Math.round(average) / 10f;
		return result;
	}
	
	Student1(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	String info() {
		return name + ", " + ban +", "+ no +", "+ kor +", "+ eng +", "+ math + ", " + getTotal() + ", " + getAverage();
	}
}
