import java.util.*;

public class Exercise4_1 {

	public static void main(String[] args) {
		int x = 15;
		char ch = '\t';
		char ch1 = 'x';
		char ch2 = '8';
		char ch3 = 'A';
		
				
		System.out.println("c" + ch + "h");
		
		if(10<x && x<20) System.out.println("True");
		if(ch==' ' || ch=='\t') {
			System.out.println("False");
		}
		else System.out.println("True");
		
		if(ch1=='x' || ch=='X') {
			System.out.println("T");
		}
		else System.out.println("F");
		
		if(0<=ch2 && ch2<=9) {
			System.out.println("T");
		}
		else {
			System.out.println("F");
		}
		
		
	}

}
