package level1;

import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12954

public class DistanceX {
	
	public DistanceX() {
		System.out.println(Arrays.toString(solution(2, 5)));
		System.out.println(Arrays.toString(solution(4, 3)));
		System.out.println(Arrays.toString(solution(4, 1)));
		System.out.println(Arrays.toString(solution(-4, 2)));
		System.out.println(Arrays.toString(solution(-10000000, 1000)));
	}

    public long[] solution(long x, int n) {
    	
        long[] answer = new long[n];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = x + i * x;
		}
        return answer;
    }
	
	public static void main(String[] args) {
		new DistanceX();
	}
}
