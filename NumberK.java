package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//문제: https://programmers.co.kr/learn/courses/30/lessons/42748

public class NumberK {
	
	public NumberK() {
		System.out.println(Arrays.toString(solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
	}
	
    public int[] solution(int[] array, int[][] commands) {
    	
    	int[] answer = new int[commands.length];
    	
    	for (int i = 0; i < commands.length; i++) {
    		ArrayList<Integer> arr = new ArrayList<Integer>();

    		for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
				arr.add(array[j]);
			}
			
    		System.out.println(arr.toString());
    		Collections.sort(arr);
    		System.out.println(arr.toString());
    		
    		answer[i] = arr.get(commands[i][2]-1);
    		
		}
    	
    	
        return answer;
    }

	public static void main(String[] args) {
		new NumberK();
	}
}
