package level1;

import java.util.ArrayList;
import java.util.Arrays;

//문제: https://programmers.co.kr/learn/courses/30/lessons/12906

public class HateSameNum {
	
	public HateSameNum() {
		System.out.println(Arrays.toString(solution(new int[] {1,1,3,3,0,1,1})));
		System.out.println(Arrays.toString(solution(new int[] {4, 4, 4, 3, 3})));
	}
	
    public int[] solution(int[] arr) {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		if(i==0) {
    			list.add(arr[i]);
    		}else {
    			if(list.get(list.size()-1) != arr[i]) {
    				list.add(arr[i]);
    			}
    		}
		}
    	
    	int[] ans = new int[list.size()];
    	
    	for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}
    	
    	return ans;

    }

	public static void main(String[] args) {
		new HateSameNum();
	}

}
