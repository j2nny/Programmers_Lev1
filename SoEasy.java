package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12937

public class SoEasy {
	
	public SoEasy() {
		System.out.println(solution(0));
	}
	
    public String solution(int num) {

    	return num%2==0 ? "Even" : "Odd";
    }

	public static void main(String[] args) {
		new SoEasy();
	}

}