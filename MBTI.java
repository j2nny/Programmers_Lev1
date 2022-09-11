package level1;

import java.util.LinkedHashMap;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/118666

public class MBTI {
	
	public MBTI() {
		System.out.println(solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
		System.out.println(solution(new String[] {"TR", "RT", "TR"}, new int[] {7, 1, 3}));
	}
	
    public String solution(String[] survey, int[] choices) {
    	
    	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
    	
    	for (String aa : "RTCFJMAN".split("")) {
			map.put(aa, 0);
		}
    	
    	for (int i = 0; i < choices.length; i++) {
			switch(choices[i]) {
			case 1:
				map.put(survey[i].split("")[0], map.get(survey[i].split("")[0])+3);
				break;
			case 2:
				map.put(survey[i].split("")[0], map.get(survey[i].split("")[0])+2);
				break;
			case 3:
				map.put(survey[i].split("")[0], map.get(survey[i].split("")[0])+1);
				break;
			case 5:
				map.put(survey[i].split("")[1], map.get(survey[i].split("")[1])+1);
				break;
			case 6:
				map.put(survey[i].split("")[1], map.get(survey[i].split("")[1])+2);
				break;
			case 7:
				map.put(survey[i].split("")[1], map.get(survey[i].split("")[1])+3);
				break;
			}
		}
    	
        String answer = "";
        
        answer += map.get("R") >= map.get("T") ? "R" : "T";
        answer += map.get("C") >= map.get("F") ? "C" : "F";
        answer += map.get("J") >= map.get("M") ? "J" : "M";
        answer += map.get("A") >= map.get("N") ? "A" : "N";
        
        return answer;
    }

	public static void main(String[] args) {
		new MBTI();
	}
}
