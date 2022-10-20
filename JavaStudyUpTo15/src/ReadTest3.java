//텍스트파일 읽어오기 
//파일 한 번에 읽기- scanner

import java.io.*;
import java.util.*;

public class ReadTest3 {

	public static void main(String[] args) {
		try {
			//파일 객체 생성
			File file = new File("Cw:\\Users\\LG\\eclipse-workspace\\JavaIO\\src\\test.txt");
			//스캐너로 파일 읽기
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
/*
Scanner scan = new Scanner(file); 에서 파일을 한 번에 읽어서 스캐너가 가지고 있고, 스캐너에 행이 있으면 그행을 하나씩 출력하는 내용이다.
*/