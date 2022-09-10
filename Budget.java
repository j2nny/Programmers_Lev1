package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.ArrayList;
import java.util.Collections;

public class Budget {
	
	public Budget() {
		System.out.println(solution(new int[] {1,3,2,5,4}, 9));
		System.out.println(solution(new int[] {2,2,3,3}, 10));
	}
	
    public int solution(int[] d, int budget) {
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	
    	for (int ii : d) {
			arr.add(ii);
		}
    	
    	Collections.sort(arr);
    	
    	int cnt = 0;
    	
    	for (int iii : arr) {
    		if(budget >= iii) {
    			budget = budget - iii;
    			cnt++;
    		} else {
    			return cnt;
    		}
		}
    	return cnt;
    }

	public static void main(String[] args) {
		new Budget();
	}
}
