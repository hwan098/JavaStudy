//연습문제6-3, 4번(Student 클래스 정의 후 총점, 평균 구하기)....

public class Exercise6_3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.ban = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}

}
class Student{

	
	String name;	//학생이름
	int ban, no, kor, eng, math;	//반, 번호, 국어점수, 영어점수, 수학점수
	
	
	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		float average = ((float)(kor + eng + math) / 3f) * 100;
		float result = Math.round(average) / 100f;
		return result;
	}
	
	
}
