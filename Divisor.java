package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/77884

public class Divisor {
	
	public Divisor() {
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));
	}
	
	public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
			answer += divisorNum(i)? i : -i;
		}
        
        return answer;
    }
	
	boolean divisorNum(int num) {
		boolean res = true;
		
		for (int i = 1; i <= num; i++) {
			if(num%i == 0) {
				res = !res;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		new Divisor();
	}
}
