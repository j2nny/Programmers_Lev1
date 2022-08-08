package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//문제: https://programmers.co.kr/learn/courses/30/lessons/12910

public class DivisorArr {
	
	public DivisorArr() {
		System.out.println(Arrays.toString(solution(new int[] {5, 9, 7, 10}, 5)));
	}
	
    public int[] solution(int[] arr, int divisor) {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for (int i : arr) {
			if(i%divisor==0) {
				list.add(i);
			}
		}
    	
    	Collections.sort(list);

    	int[] answer = new int[list.size()];
    	
    	if(list.size()==0) {
    		answer =  new int[] {-1};
    	}else {
    		
    		for (int i = 0; i < list.size(); i++) {
    			answer[i] = list.get(i);
    		}
    		
    	}
    	
        return answer;
    }

	public static void main(String[] args) {
		new DivisorArr();
	}

}
