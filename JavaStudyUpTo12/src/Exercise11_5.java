import java.util.*;

//Comparable을 사용하고자 한다면 compareTo 메소드를 Override 해주어야 한다
class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//o가 student 클래스의 인스턴스이면 o를 tmp에 저장하고 리턴값으로 학생의 이름을 돌려준다.
	public int compareTo(Object o) {			
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return name.compareTo(tmp.name);
		}
		else {
			return -1;
		}
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}

class Exercise11_5 {

	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 								
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student("김자바", 1, 3, 80, 80, 90));
		list.add(new Student("이자바", 1, 4, 70, 90, 70));
		list.add(new Student("안자바", 1, 5, 60, 100, 80));
		
		//list 정렬(가나다 순으로 정렬되었음)
		Collections.sort(list);																	
		
		//리스트의 모든 값을 가져오기 위해 iterator()사용, iterator는 값을 가져오거나 삭제할 때 사용
		Iterator it = list.iterator();						
		
		// Iterator 안에 다음 값이 들어있는지 확인 들어있으면 true
		while(it.hasNext()) {
			//Iterator의 다음 값 가져오기
			System.out.println(it.next());
		}
	}
}