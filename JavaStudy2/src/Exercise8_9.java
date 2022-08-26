class UnsupportedFuctionException extends RuntimeException {
	
	private final int ERR_CODE;
	UnsupportedFuctionException(String msg, int errCode) { // 생성자
		super(msg);
		ERR_CODE = errCode;
	}
	UnsupportedFuctionException(String msg) { // 생성자
		this(msg, 100); // ERR_CODE 100( ) . 를 기본값 으로 초기화한다
	}
	public int getErrCode() { // . 에러 코드를 얻을 수 있는 메서드도 추가했다
		return ERR_CODE; // getMessage() . 이 메서드는 주로 와 함께 사용될 것이다
	} 
	public String getMessage() { // Exception getMeesage() . 의 를 오버라이딩한다
		return getErrCode()+  super.getMessage();
	}
	}
	class Exercise8_9 {
		public static void main(String[] args) throws Exception
		{
			throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100); 
		}
}