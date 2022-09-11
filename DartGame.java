package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/17682

import java.util.ArrayList;
import java.util.regex.Pattern;

public class DartGame {
	
	public DartGame() {
		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
	}
	
    public int solution(String dartResult) {
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	
    	int i = 0;
    	
    	while(dartResult.length() > i) {
    		if(Pattern.matches("[0-9]", dartResult.split("")[i])){
    			if(dartResult.split("")[i].equals("1") && dartResult.split("")[i+1].equals("0")) {
    				arr.add(10);
    				i = i+2;
    			} else {
    				arr.add(Integer.parseInt(dartResult.split("")[i]));
    				i++;
    			}
    		} else {
    			if(dartResult.split("")[i].equals("D")) {
    				arr.set(arr.size() - 1, (int) Math.pow(arr.get(arr.size() - 1), 2));
    			} else if(dartResult.split("")[i].equals("T")) {
    				arr.set(arr.size() - 1, (int) Math.pow(arr.get(arr.size() - 1), 3));
    			} else if(dartResult.split("")[i].equals("*")) {
    				if(arr.size() >= 2) {
    					arr.set(arr.size() - 2, arr.get(arr.size() - 2) * 2);
    				}
    				arr.set(arr.size() - 1, arr.get(arr.size() - 1) * 2);
    			} else if(dartResult.split("")[i].equals("#")) {
    				arr.set(arr.size() - 1, arr.get(arr.size() - 1) * (-1));
    			}
    			i++;
    		}
		}
    	
        int answer = 0;
        
        for (int ii : arr) {
			answer += ii;
		}
        return answer;
    }

	public static void main(String[] args) {
		new DartGame();
	}
}