package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/12912

public class SumNums {

	public SumNums() {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}
	
    public long solution(int a, int b) {
        long answer = 0;
        
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		new SumNums();
	}

}
