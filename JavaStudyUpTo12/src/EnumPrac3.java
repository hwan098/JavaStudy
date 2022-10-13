
public class EnumPrac3 {

	public static void main(String[] args) {
		int test = 1;
        
        if(test == 1){
            switchFt(Company.SAMSUNG);
        }		
	}

	public static void switchFt(Company company) {
		switch(company) {
		case SK:
			System.out.println("SK입니다.");
		case LG:
			System.out.println("LG입니다.");
		case SAMSUNG:
			System.out.println("SAMSUNG입니다.");
		case APPLE:
			System.out.println("APPLE입니다.");
		case GOOGLE:
			System.out.println("GOOGLE입니다.");
			break;
		}
	}
}
