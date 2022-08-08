package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

//문제: https://programmers.co.kr/learn/courses/30/lessons/42840

public class MathHater {
	
	public MathHater() {
		
		int[] aa = new int[10000];
		
		for (int i = 0; i < 10000; i++) {
			aa[i] = 1;
		}
		
//		System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
		System.out.println(Arrays.toString(solution(aa)));
	}
	
    public int[] solution(int[] answers) {
        
        String ans1 = "12345".repeat(answers.length/5)+"12345".substring(0, answers.length%5);
        String ans2 = "21232425".repeat(answers.length/8)+"21232425".substring(0, answers.length%8);
        String ans3 = "3311224455".repeat(answers.length/10)+"3311224455".substring(0, answers.length%10);
        
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        
        System.out.println("=====================");
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        
        for (int i = 0; i < answers.length; i++) {
        	if((ans1.toCharArray()[i]+"").equals(answers[i]+"")) {
        		score1++;
        	}
        	if((ans2.toCharArray()[i]+"").equals(answers[i]+"")) {
        		score2++;
        	}
        	if((ans3.toCharArray()[i]+"").equals(answers[i]+"")) {
        		score3++;
        	}
		}
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(score1);
        arr.add(score2);
        arr.add(score3);
        
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == (int) Collections.max(arr)) {
				arr2.add(i+1);
			}
		}
        
        int[] answer = new int[arr2.size()];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = arr2.get(i);
		}
        
        return answer;
		
    }
	
	public static void main(String[] args) {
		new MathHater();
	}

}
