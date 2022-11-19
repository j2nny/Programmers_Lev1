package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/132267

public class Coke {
	
	public Coke() {
		System.out.println(solution(2, 1, 20));
		System.out.println(solution(3, 1, 20));
	}
	
    public int solution(int a, int b, int n) {
    	
    	int answer = 0;
    	
    	while(n >= a) {
    		answer += (n / a) * b;
    		n = (n % a) + (n / a * b);
    	}
        
        return answer;
    }

	public static void main(String[] args) {
		new Coke();
	}
}
