package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12928

public class DivisorSum {
	
	public DivisorSum() {
		System.out.println(solution(12));
		System.out.println(solution(5));
	}
	
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
        
        return answer;
    }

	public static void main(String[] args) {
		new DivisorSum();
	}

}
