package level1;

import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/142086

public class Banana {

	public Banana() {
		System.out.println(Arrays.toString(solution("banana")));
		System.out.println(Arrays.toString(solution("foobar")));
	}
	
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        int index = 0;
        for (char c : s.toCharArray()) {
        	int lastIdx = s.substring(0, index).lastIndexOf(String.valueOf(c));
			answer[index] = lastIdx == -1 ? -1 : index - lastIdx;
			index++;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		new Banana();
	}
}
