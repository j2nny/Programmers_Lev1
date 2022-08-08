package level1;

//문제:https://programmers.co.kr/learn/courses/30/lessons/12903

public class CenterLetter {
	
	public CenterLetter() {
		System.out.println(solution("abcde"));
	}
	
	public String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0) {
        	answer += s.charAt(s.length()/2-1);
        }
        
        answer += s.charAt(s.length()/2);
        
        return answer;
    }
	
	public static void main(String[] args) {
		new CenterLetter();
	}


}
