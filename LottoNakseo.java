package level1;

import java.util.ArrayList;
import java.util.Arrays;

//문제: https://programmers.co.kr/learn/courses/30/lessons/77484

public class LottoNakseo {

	public LottoNakseo() {
		System.out.println(Arrays.toString(solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25})));
		System.out.println(Arrays.toString(solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
	}

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		ArrayList<Integer> win = new ArrayList<Integer>();
		for (Integer num : win_nums) {
			win.add(num);
		}

		ArrayList<Integer> myNums = new ArrayList<Integer>();
		int cnt = 0;
		for (Integer mynum : lottos) {
			myNums.add(mynum);
			if(mynum==0) {
				cnt++;
			}
		}
		
		win.retainAll(myNums);
		
		answer[0] = checkLotto(win.size()+cnt);
		answer[1] = checkLotto(win.size());
		

		return answer;
	}
	
	int checkLotto(int retain) {
		switch(retain) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default:
			return 6;
		}
	}

	public static void main(String[] args) {
		new LottoNakseo();
	}

}
