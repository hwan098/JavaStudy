//버퍼를 이용해 파일에 쓰기

import java.io.*;

public class WriteTest1 {

	public static void main(String[] args) {
		try {
			//파일 객체 생성
			File file = new File("Cw:\\Users\\LG\\eclipse-workspace\\JavaIO\\src\\test.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)); 
			
			if(file.isFile() && file.canWrite()) {
				//쓰기
				bufferedWriter.write("문자열 추가1");
				bufferedWriter.newLine();
				bufferedWriter.write("문자열 추가2");
				
				bufferedWriter.close();
			}
			else {
				System.out.println("dwqdwq");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
