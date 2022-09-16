package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12934

public class IsRoot {
	
	public IsRoot() {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}
	
    public long solution(long n) {
    	
    	long ii = (long) Math.sqrt(n);
    	
    	if(ii * ii == n) {
    		return (long) ((ii + 1) * (ii + 1));
    	} else {
    		return -1;
    	}
    }

	public static void main(String[] args) {
		new IsRoot();
	}
}