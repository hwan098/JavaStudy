import java.io.*;

public class FileReaderEx1 {

	public static void main(String[] args) {
		try {
			String fileName = "D:\\hi.txt";
			FileInputStream fis = new FileInputStream(fileName);	//바이트기반 스트림이기 때문에 한글이 깨져서 출력된다.
			FileReader fr = new FileReader(fileName);				//문자기반 스트림이기 때문에 한글이 출력된다.
			
			int data = 0;
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			while((data=fr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
