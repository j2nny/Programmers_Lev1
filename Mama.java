package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/133499

public class Mama {
	
	public Mama() {
		System.out.println(solution(new String[] {"aya", "yee", "u", "maa"}));
		System.out.println(solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
	}
	
    public int solution(String[] babbling) {
    	
    	String[] strs = {"aya", "ye", "woo", "ma"};

    	int answer = 0;
    	
    	roop1: for (String string : babbling) {
    		
    		for (String str : strs) {
				if(string.contains(str.repeat(2))) {
					continue roop1;
				}
			}
    		
    		if(string.split("aya|ye|woo|ma").length == 0) {
    			answer++;
    		};
		}
    
        return answer;
    }

	public static void main(String[] args) {
		new Mama();
	}
}
