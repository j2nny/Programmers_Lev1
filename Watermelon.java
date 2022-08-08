package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/12922

public class Watermelon {

	public Watermelon() {
		System.out.println(solution(5));
	}
	
    public String solution(int n) {
        String answer = "";
        
        for (int i = 0; i < n; i++) {
        	answer+="수 박".split(" ")[i%2];
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		new Watermelon();
	}

}
