package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/12919

public class FindKim {
	
	public FindKim() {
		System.out.println(solution(new String[] {"Jane", "Kim"}));
	}

    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        
        for (int i = 0; i < seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer += i;
        	}
		}
        
        answer += "에 있다";
        
        return answer;
    }
	
	public static void main(String[] args) {
		new FindKim();
	}

}
