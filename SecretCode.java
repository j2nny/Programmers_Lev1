package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/155652

public class SecretCode {
	
	public SecretCode() {
		System.out.println(solution("aukks", "wbqd", 5));
		System.out.println(solution("ybcde", "az", 1));
	}
	
    public String solution(String s, String skip, int index) {
    	
        String answer = "";
    	
    	for (char c : s.toCharArray()) {
    		
    		for (int i = 0; i < index; i++) {
    			
				if(c > 'z') {
					c = (char)((int)c-26);
				}
				
				do {
					c++;
					if(c > 'z') {
						c = (char)((int)c-26);
					}
				} while(skip.contains(String.valueOf(c)));
			}
    		
    		answer += c;
		}

        return answer;
    }

	public static void main(String[] args) {
		new SecretCode();
	}
}
