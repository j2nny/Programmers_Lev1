package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12943

public class Collatz {

	public Collatz() {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
	}
	
    public int solution(int num) {
        int answer = 0;
        
        while(num!=1) {
        	num = num%2 == 1 ? num*3 + 1 : num/2;
        	answer++;
        	
        	if(answer>500) {
        		break;
        	}
        }
        return answer >= 500 ? -1 : answer;
    }
	
	public static void main(String[] args) {
		new Collatz();
	}

}
