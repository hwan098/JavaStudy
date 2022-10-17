import java.awt.Toolkit;

public class SleepEx1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i < 10; i++) {
			toolkit.beep();
			System.out.println("3초 후 BEEP음이 울립니다.");
			
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
