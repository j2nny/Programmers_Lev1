package level1;

import java.util.ArrayList;

//문제: https://programmers.co.kr/learn/courses/30/lessons/86051

public class MissingNumsSum {
	
	public MissingNumsSum() {
		System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));
	}
	
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Integer num : numbers) {
			arr.add(num);
		}
        
        for (int i = 0; i < 10; i++) {
			if(!arr.contains(i)) {
				answer += i;
			}
		}
        
        return answer;
    }
    
	public static void main(String[] args) {
		new MissingNumsSum();
	}

}
