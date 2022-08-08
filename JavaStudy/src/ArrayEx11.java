
public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i < numArr.length; i++) {
			counter[numArr[i]]++;	//i의 값이 0일 때 numArr[0]의 값은 8이다. 이 때 counter[8]의 값을 1 증가시킨다. 
		}
		
		for(int i=0; i < numArr.length; i++) {
			System.out.println(i + "의 개수:" + counter[i]);
		}

	}

}
