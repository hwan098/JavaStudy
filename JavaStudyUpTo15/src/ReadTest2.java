//텍스트파일 읽어오기 
//버퍼를 이용하여 한 줄씩 읽어오기 --> 문자를 효율적으로 입출력해서 CPU부하를 줄일 수 있기 때문임

import java.io.*;

public class ReadTest2 {

	public static void main(String[] args) {
		try {
			//파일 객체 생성
			File file = new File("C:\\Users\\LG\\eclipse-workspace\\JavaIO\\src\\test.txt");
			//입력 스트림 생성
			FileReader fileReader = new FileReader(file);
			//입력 버퍼 생성
			BufferedReader bufferReader = new BufferedReader(fileReader);
			String line = "";
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferReader.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
