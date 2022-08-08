package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class PandY {

	public PandY() {
		System.out.println(solution("Pyy"));
	}
	
	boolean solution(String s) {
        boolean answer = false;

        int p = 0, y = 0;
        
        for (String ss : s.toLowerCase().split("")) {
			if(ss.equals("p")) {
				p++;
			} else if(ss.equals("y")) {
				y++;
			}
		}
        
        if(p==y) {
        	answer = true;
        }

        return answer;
    }
	
	public static void main(String[] args) {
		new PandY();
	}

}
