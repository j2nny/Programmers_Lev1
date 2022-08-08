package level1;

import java.util.regex.Pattern;

//문제: https://programmers.co.kr/learn/courses/30/lessons/72410

public class RecommendID {
	
	public RecommendID() {
//		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		
	}
	
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        
        String step2 = "";
        for (char c : answer.toCharArray()) {
			if(Pattern.matches("[a-z0-9-_[.]]", c+"")) {
				step2 += c;
			}
		}
        answer = step2;
        
        while(answer.contains("..")) {
        	answer = answer.replaceAll("[.][.]", ".");
        }
        
        if(answer.startsWith(".")) {
        	answer = answer.substring(1);
        }
        if(answer.endsWith(".")) {
        	answer = answer.substring(0, answer.length()-1);
        }
        
        if(answer.equals("")) {
        	answer += "a";
        }
        
        if(answer.length()>=16) {
        	answer = answer.substring(0, 15);
        }
        
        if(answer.endsWith(".")) {
        	answer = answer.substring(0, answer.length()-1);
        }
        
        System.out.println(answer);
        
        if(answer.length()<=2) {
        	while(answer.length()<3) {
        		System.out.println(answer.length());
        		answer = answer.concat(answer.substring(answer.length()-1));
        	}
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		new RecommendID();
	}
}
