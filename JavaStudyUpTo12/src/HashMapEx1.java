import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요. ");
			System.out.print("id : ");
			String id = scanner.nextLine().trim();
			
			System.out.print("password : ");
			String password = scanner.nextLine().trim();
			System.out.println();
			
			//containKey() --> 해시맵에 지정된 키가 포함되어 있는지 확인
			if(!map.containsKey(id)) {	
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요." );
				continue;
			}
			//get() --> 지정된 키의 값을 반환하는데 못찾으면 null반환
			if(!map.get(id).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요." );
			}
			else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}
}
/*
 * 1.  해쉬맵 초기값 설정
 * 2. 스캐너로 id, pw받아서 초기값이랑 같은지 확인
 *  - 아이디 확인 -> containKey()로 해시맵 안에 입력한 아이디가 존재하는지 확인
 *  	->받은 아이디가 있으면 비밀번호로 넘어가고, 없으면 다시 입력 
 *  - 비밀번호 확인 -> get().equals()로 지정된 아이디 값이랑 입력한 비밀번호가 맞는지 확인
 *  	->받은 비밀번호가 아이디랑 같으면 종료, 같지 않으면 비밀번호가 틀리다고 출력하고 처음부터 다시 입력
 * */
 