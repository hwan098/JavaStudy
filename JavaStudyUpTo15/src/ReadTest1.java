//텍스트파일 읽어오기 char

import java.io.*;

public class ReadTest1 {

	public static void main(String[] args) {
		try {
			//파일 객체 생성
			File file = new File("C:\\Users\\LG\\eclipse-workspace\\JavaIO\\src\\test.txt");
			//입력 스트림 생성
			FileReader fileReader = new FileReader(file);
			int singleCh = 0;
			while((singleCh = fileReader.read()) != -1) {
				System.out.print((char)singleCh);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
