package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/131128

public class FriendNum {
	
	public FriendNum() {
		System.out.println(solution("100", "2345"));
		System.out.println(solution("100", "203045"));
		System.out.println(solution("100", "123450"));
		System.out.println(solution("12321", "123450"));
		System.out.println(solution("100", "123450"));
	}
	
    public String solution(String X, String Y) {
    	
    	Map<Character, Integer> mapX = new HashMap<Character, Integer>();
    	Map<Character, Integer> mapY = new HashMap<Character, Integer>();
    	
    	for (char ch : X.toCharArray()) {
			mapX.put(ch, mapX.getOrDefault(ch, 0) + 1);
		}
    	
    	for (char ch : Y.toCharArray()) {
    		mapY.put(ch, mapY.getOrDefault(ch, 0) + 1);
    	}
    	
    	List<String> answer = new ArrayList<String>();
    	
    	for (char ch : mapX.keySet()) {
			if(mapY.containsKey(ch)) {
				for (int i = 0; i < Math.min(mapX.get(ch), mapY.get(ch)); i++) {
					answer.add(String.valueOf(ch));
				}
			}
		}
    	
    	if(answer.isEmpty()) {
    		return "-1";
    	}
    	
    	Collections.sort(answer);
    	Collections.reverse(answer);
    	
    	return String.join("", answer).startsWith("0") && String.join("", answer).endsWith("0") ? "0" : String.join("", answer);
    }

	public static void main(String[] args) {
		new FriendNum();
	}
}
