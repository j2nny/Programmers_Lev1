package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//문제: https://programmers.co.kr/learn/courses/30/lessons/68644

public class RandomPlus {
	
	public RandomPlus() {
		System.out.println(solution(new int[] {2,1,3,4,1}));
	}
	
	public int[] solution(int[] numbers) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (Integer ii : set) {
			arr.add(ii);
		}
		
		Collections.sort(arr);
		
		int[] answer = new int[arr.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr.get(i);
		}
		
        return answer;
    }

	public static void main(String[] args) {
		new RandomPlus();
	}

}
