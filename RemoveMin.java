package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12935

public class RemoveMin {
	
	public RemoveMin() {
		System.out.println(Arrays.toString(solution(new int[] {4, 3, 2, 1})));
		System.out.println(Arrays.toString(solution(new int[] {10})));
	}
	
    public int[] solution(int[] arr) {
    	
    	if(arr.length == 1) {
    		return new int[] {-1};
    	}
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for (int i : arr) {
			list.add(i);
		}
    	
    	list.remove(Collections.min(list));
    	
    	int[] res = new int[list.size()];
    	
    	for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
    	
    	return res;
    }

	public static void main(String[] args) {
		new RemoveMin();
	}

}
