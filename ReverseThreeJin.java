package level1;

import java.util.ArrayList;
import java.util.Collections;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/68935

public class ReverseThreeJin {
	
	public ReverseThreeJin() {
		System.out.println(solution(9));
	}
	
    public int solution(int n) {
    	
    	if(n == 1) {
    		return 1;
    	}
    	
    	int max = 0;
    	
    	
    	while(n >= Math.pow(3, max)) {
    		max++;
    	}
    	
    	String threeJin = "";

    	for (int i = max-1; i >= 0; i--) {
			threeJin += (long)(n / Math.pow(3, i));
			n = (int) (n - (int)(n / Math.pow(3, i)) * Math.pow(3, i));
		}
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	
    	for (String ss : threeJin.split("")) {
    		arr.add(Integer.parseInt(ss));
		}
    	
    	Collections.reverse(arr);
    	
    	int ans = 0;
    	
    	for (int i = 0; i < arr.size(); i++) {
			ans += Math.pow(3, arr.size()-i-1) * arr.get(i);
		}
    	
        return ans;
    }

	public static void main(String[] args) {
		new ReverseThreeJin();
	}

}
