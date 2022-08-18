//연습문제7_18 action method 작성
//형변환?

public class Exercise7_18 {
	
	    public static void action(Robot r) {	// 왜 public static인지 , 매개변수는 왜 Robot타입인지?
		   
		   if(r instanceof DanceRobot) {
			   DanceRobot d = (DanceRobot)r;	
			   d.dance();
		   }
		   else if(r instanceof SingRobot) {
			   SingRobot s = (SingRobot)r;
			   s.sing();
		   }
		   else if(r instanceof  DrawRobot) {
			   DrawRobot dr = (DrawRobot)r;
			   dr.draw();
		   }
	   }
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
		action(arr[i]);
	}
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다. "); 
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다. "); 
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다. "); 
	}
}
