package level1;

import java.util.ArrayList;
import java.util.Collections;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42576

public class Marathon {
	
	public Marathon() {
		System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
	}
	
    public String solution(String[] participant, String[] completion) {

    	ArrayList<String> participantArr = new ArrayList<String>();
    	for (String string : participant) {
			participantArr.add(string);
		}
    	
    	ArrayList<String> completionArr = new ArrayList<String>();
    	for (String string : completion) {
			completionArr.add(string);
		}
    	
    	Collections.sort(participantArr);
    	Collections.sort(completionArr);
    	
    	for (int i = 0; i < completionArr.size(); i++) {
			if(!participantArr.get(i).equals(completionArr.get(i))) {
				return participantArr.get(i);
			}
		}
    	
    	return participantArr.get(participantArr.size() - 1);
    }

	public static void main(String[] args) {
		new Marathon();
	}
}
