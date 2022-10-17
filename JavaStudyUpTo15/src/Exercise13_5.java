class Exercise13_5 {
	
	public static void main(String[] args) throws Exception{
		Thread3 th1 = new Thread3();
		th1.start();
		try {
			Thread.sleep(5*1000);
		} catch(Exception e) {}
		throw new Exception("꽝~!!!"); 
	}
}

class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	} // run()
}

/*
 * 0~9까지 1초마다 표시되는데, 예외가 5초일 때 발생시켰기때문에 5일때 꽝표시, 이후 원래 순서대로 표시
 * */