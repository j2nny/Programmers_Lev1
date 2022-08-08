package level1;

import java.util.ArrayList;
import java.util.Collections;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12917

public class SortString {
	
	public SortString() {
		System.out.println(solution("Zbcdefg"));
	}

    public String solution(String s) {
    	
    	ArrayList<String> arr = new ArrayList<String>();
    	
    	for (String string : s.split("")) {
			arr.add(string);
		}
    	
    	Collections.sort(arr);
    	Collections.reverse(arr);
    	
    	return String.join("", arr);
    }
	
	public static void main(String[] args) {
		new SortString();
	}

}
