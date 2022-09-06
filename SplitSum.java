package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12931

public class SplitSum {
	
	public SplitSum() {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
	
    public int solution(int n) {
        int answer = 0;

        for (String ii : (n+"").split("")) {
			answer += Integer.parseInt(ii);
		}
        
        return answer;
    }
    
	public static void main(String[] args) {
		new SplitSum();
	}

}
