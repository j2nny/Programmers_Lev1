package level1;

import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12932

public class ReverseNum {
	
	public ReverseNum() {
		System.out.println(Arrays.toString(solution(12345)));
	}
	
    public int[] solution(long n) {
    	
    	char[] asis = (n+"").toCharArray();

    	int[] answer = new int[asis.length];
    	
    	for (int i = 0; i < asis.length; i++) {
			answer[i] = asis[asis.length-i-1]-'0';
		}
    	
        return answer;
    }

	public static void main(String[] args) {
		new ReverseNum();
	}

}
