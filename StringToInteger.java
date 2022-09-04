package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12925

public class StringToInteger {
	
	public StringToInteger() {
		System.out.println(solution("+1234"));
	}
	
    public int solution(String s) {
        return Integer.parseInt(s);
    }

	public static void main(String[] args) {
		new StringToInteger();
	}

}
