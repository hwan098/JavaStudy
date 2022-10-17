class Exercise13_6 {
	public static void main(String[] args) throws Exception{
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		try {
			th1.sleep(5*1000);
		} catch(Exception e) {}
		throw new Exception("꽝~!!!"); 
	}
}

class Thread4 extends Thread {
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
 * 0~9까지 1초마다 표시되는데, 예외가 5초일 때 발생시켰기때문에 5일때 꽝표시, setDaemon 사용했으므로 예외 발생하고 종료
 * */