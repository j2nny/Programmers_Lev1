package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12947

public class Hashard {
	
	public Hashard() {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}
	
    public boolean solution(int x) {
        
    	int sum = 0;
    	
    	for (String s : (x+"").split("")) {
			sum += Integer.parseInt(s);
		}
    	
    	return x % sum == 0;
    }

	public static void main(String[] args) {
		new Hashard();
	}

}
