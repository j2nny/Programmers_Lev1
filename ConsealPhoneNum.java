package level1;

public class ConsealPhoneNum {
	
	public ConsealPhoneNum() {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
	
    public String solution(String phone_number) {

    	
    	return "*".repeat(phone_number.length()-4)+phone_number.substring(phone_number.length()-4);
    }

	public static void main(String[] args) {
		new ConsealPhoneNum();
	}

}
