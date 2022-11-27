package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/138477

public class HallOfFame {
	
	public HallOfFame() {
		System.out.println(Arrays.toString(solution(3, new int[] {10, 100, 20, 150, 1, 100, 200})));
		System.out.println(Arrays.toString(solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
	}
	
    public int[] solution(int k, int[] score) {
    	
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<Integer>();
        
        int i = 0;
        for (int num : score) {
			list.add(num);
			Collections.sort(list);
			Collections.reverse(list);
			List<Integer> subList = list.size() > k ? list.subList(0, k) : list;
			answer[i++] = subList.get(subList.size() - 1);
		}
        
        return answer;
    }

	public static void main(String[] args) {
		new HallOfFame();
	}

}
