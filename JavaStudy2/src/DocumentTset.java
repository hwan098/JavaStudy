class Document{
	static int count = 0;	//staatic 멤버변수 지정
	String name;			//인스턴스 멤버변수 지정
	
	Document(){
		this("제목없음" + ++count);	//아무 것도 입력되지 않았을 경우 
	}
	Document(String name){
		this.name = name;	//name은 인스턴스 변수이므로 생성자를 생성해야 함 
		System.out.println("문서 " + this.name + "가(이) 생성되었습니다.");
	}
	
}
public class DocumentTset {

	public static void main(String[] args) {
		Document d1 = new Document();			//인스턴스 생성
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document("한글.hwp");
		Document d5 = new Document();

	}

}
