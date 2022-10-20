import java.io.*;

public class BufferReaderEx1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\LG\\git\\JavaStudy\\JavaStudyUpTo15\\src\\BufferReaderEx1.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i=0; (line = br.readLine()) != null; i++) {
				if(line.indexOf(";") != -1) {
					System.out.println(i + ": " + line);
				}
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
