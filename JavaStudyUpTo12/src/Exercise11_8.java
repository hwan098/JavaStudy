import java.util.*;

class Student3 implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;
	
	Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}
	
	public int compareTo(Object o) {
		if (o instanceof Student3) {
			Student3 tmp = (Student3) o;
			return this.total < tmp.total ? 1 : -1; // ( ) . 총점 기준 내림차순 으로 정렬한다
		} 
		return -1;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage() + "," + schoolRank;
	}
	
	
} // class Student

	
class Exercise11_8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);	//리스트를 내림차순으로 정렬
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		int sameRank = 0;
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			Student3 student = (Student3) it.next();
			if(student.total == prevTotal) {
				student.schoolRank = prevRank;
				sameRank++;
			}else {
				student.schoolRank = prevRank == -1 ? 1 : prevRank + sameRank + 1;
				prevTotal = student.total;
				prevRank = student.schoolRank;
				sameRank = 0;
			}
		}
		for(int i=0; i < length; i++) {
		    Student3 student = (Student3)list.get(i);
		//총점(total)이 이전총점(prevTotal)과 같으면 이전 등수(prevRank)를 등수(schoolRank)로 한다.
		if(student.total == prevTotal) {
			student.schoolRank = prevRank;
		}else {
		//총점이 서로 다르면, 등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
		//이전에 동점자였다며, 그 다음 등수는 동점자의 수를 고려해야한다.
			student.schoolRank = i + 1;
		}
		//현재 총점과 등수를 이전총점(prevTotal)과 이전등수(prevRank)에 저장한다.
		prevRank = student.schoolRank;
		prevTotal = student.total;
		}
	}

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80)); 
		list.add(new Student("홍길동",1,3,100,100,100)); 
		list.add(new Student("남궁성",1,1,90,70,80)); 
		list.add(new Student("김자바",1,2,80,80,90)); 
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		System.out.println();
		
		//읽어올 다음 요소가 있는지 확인하고 있을 때까지 다음요소를 읽어오기
		while(it.hasNext())
			System.out.println(it.next());
	}
	
}
