package level1;

import java.util.ArrayList;
import java.util.Collections;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12933

public class SortNum {
	
	public SortNum() {
		System.out.println(solution(118372));
	}

    public long solution(long n) {
        
    	ArrayList<String> arr = new ArrayList<String>();
    	
    	for (String str : (n+"").split("")) {
			arr.add(str);
		}
    	
    	Collections.sort(arr);
    	Collections.reverse(arr);
    	
    	return Long.parseLong(String.join("", arr));
    	
    }
	
	public static void main(String[] args) {
		new SortNum();
	}
}
