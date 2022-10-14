enum Company {
	SK("에스케이"), LG("엘지"), APPLE("애플"), SAMSUNG("삼성"), GOOGLE("구글");

	private final String value;

	Company(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
