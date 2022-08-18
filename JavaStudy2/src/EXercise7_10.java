//연습문제 7-10, 11


class MyTv2 {
	boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int channel) {
		prevChannel = this.channel; //멤버변수 channel을 prevChannel에 저장 / (1)10 = 10 (2) 10 = 10 (3) 20 = 20 
		this.channel = channel;		//입력받은 수를 멤버변수 channel에 저장 / (1)10 = 10 (2) 20 = 20 (3) 10 = 10
									//this는 멤버변수를 나타낸다.
	}
	public void setVolume(int volume) {
		 this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		 return volume;
	}
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class EXercise7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());



	}

}
