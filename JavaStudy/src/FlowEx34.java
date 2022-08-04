import java.util.*;

public class FlowEx34 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:	//전체종료를 위해 가장 상위 반복문에 outer: 지정 
		while(true) {	//사용자가 종료하지 않을 경우 무한 반복(첫 메뉴 화면)
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하시는 메뉴(1~3)를 선택하세요.(종료:0)>>");
			
			String tmp = scanner.nextLine();	// 첫 화면에서 메뉴를 선택하기 위해 tmp변수에 문자형으로 값을 받음
			menu = Integer.parseInt(tmp);     //문자형으로 받은 tmp값을 정수형으로 바꿔주고 menu변수에 저장 
			
			if(menu==0) {
				System.out.println("프로그램 종료");	//첫 메뉴에서 0을 누를경우 종료
				break;								
			}
			else if(!(1<=menu && menu<=3)) {	
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");	//첫 메뉴에서 1,2,3번을 선택 안했을 경우 다음 반복문으로 넘어감
				continue;
			}
			
			for(;;) {	//초건식과 증감식이 모두 생략 되었기 때문에 무한반복문이 된다. --> 무한 반복문을 빠져나오기 위해 if문을 사용
				System.out.print("계산할 값 입력.(종료 0, 전체 종료 99)>>"); //두번째 메뉴에서 값 입력
				tmp = scanner.nextLine();	//받은 문자 값을 tmp에 저장							  
				num = Integer.parseInt(tmp);	//tmp값을 정수형으로 변환 후 num에 저장
				
				if(num == 0) {	//계산값을 입력받았을 때 0이면 두번째 메뉴(for문)종료
					break;
				}
				if(num == 99) {
					break outer;	//계산값을 입력받았을 때 0이면 첫번째 메뉴까지(while, for문)종료
				}
				switch(menu) {	//첫 메뉴에서 1,2,3 번호 별 실행 
				case 1:
					System.out.println("result= " + num*num);
					break;
				case 2:
					System.out.println("result= " + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result= " + Math.log(num));
					break;
				}
			}
		}

	}

}
