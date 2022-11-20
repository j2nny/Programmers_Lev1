package level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PickDoll {

	public PickDoll() {
		System.out.println(solution(new int[][] {
			{0,0,0,0,0},
			{0,0,1,0,3},
			{0,2,5,0,1},
			{4,2,4,4,2},
			{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4}));
	}

	public int solution(int[][] board, int[] moves) {

		List<Queue<Integer>> list = new ArrayList<Queue<Integer>>();

		for (int[] numList : board) {
			for (int i = 0; i < numList.length; i++) {
				if(list.size() == i) {
					list.add(new LinkedList<Integer>());
				}

				if(numList[i] != 0) {
					list.get(i).add(numList[i]);
				}
			}
		}

		List<Integer> bucket = new ArrayList<Integer>();
		int cnt = 0;
		
		for (int num : moves) {
			Integer doll = list.get(num-1).poll();
			
			if(doll == null) {
				continue;
			}
			
			if(!bucket.isEmpty() && bucket.get(bucket.size()-1) == doll) {
				bucket.remove(bucket.size()-1);
				cnt += 2;
			} else {
				bucket.add(doll);
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		new PickDoll();
	}
}
