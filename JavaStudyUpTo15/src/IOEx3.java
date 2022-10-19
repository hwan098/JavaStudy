// ByteArrayInputStream, ByteArrayOutputStream, read(), write()

import java.io.*;
import java.util.*;

public class IOEx3 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) {	//available() : 스트림으로부터 읽어 올 수 있는 데이터의 크기를 반환힌다.
				input.read(temp);		//temp의 크기만큽 읽어서 배열을 채우고 읽어온 데이터 수를 반환한다.
				output.write(temp);		//temp에 저장된 모든 내용을 출력소스에 쓴다.
				System.out.println("temp : " + Arrays.toString(temp)); //temp 배열 출력
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		}catch(IOException e) {
			
		}
		input.read(temp, 0, temp.length);
		output.write(temp, 5, 5);
	
		outSrc = output.toByteArray(); //inputstram을 byte배열로 변환 
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
	}

}
