package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/147355

public class SmallSubString {

	public SmallSubString() {
		System.out.println(solution("3141592", "271"));
	}
	
    public int solution(String t, String p) {
        int answer = 0;
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
        	
        	String substring = t.substring(i, i+p.length());
        	
			if(Long.parseLong(substring) <= Long.parseLong(p)) {
				answer++;
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		new SmallSubString();
	}

}
