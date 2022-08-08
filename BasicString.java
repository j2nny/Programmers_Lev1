package level1;

import java.util.regex.Pattern;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12918

public class BasicString {

	public BasicString() {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
	
    public boolean solution(String s) {
    	
        return Pattern.matches("[0-9]{4}", s) || Pattern.matches("[0-9]{6}", s);
    }
	
	public static void main(String[] args) {
		new BasicString();
	}
}
