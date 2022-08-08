package level1;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

//문제: https://programmers.co.kr/learn/courses/30/lessons/42889

public class Failure {
	
	public Failure() {
		System.out.println(Arrays.toString(solution(4, new int[] {4,4,4,4,4})));
	}
	
	class Stage{
		int stageNum;
		double failureLate;
		
		@Override
		public String toString() {
			return stageNum+", "+failureLate;
		}
	}
	
	class StageSort implements Comparator{

		public int compare(Object o1, Object o2) {
			int res;
			
			if(((Stage)o2).failureLate - ((Stage)o1).failureLate > 0) {
				res = 1;
			} else if(((Stage)o2).failureLate - ((Stage)o1).failureLate < 0){
				res = -1;
			} else  {
				res = ((Stage)o1).stageNum - ((Stage)o2).stageNum;
			}
			
			return res;
		}
		
	}

    public int[] solution(int N, int[] stages) {
    	
    	TreeSet<Stage> ts = new TreeSet<Stage>(new StageSort());
    	
    	for (int i = 1; i <= N; i++) {
			double total = 0, fail = 0;
			for (int j = 0; j < stages.length; j++) {
				if(stages[j] >= i) {
					total++;
				}
				if(stages[j] == i) {
					fail++;
				}
			}
			
			Stage st = new Stage();
			st.stageNum = i;
			st.failureLate = fail/total;
			
			ts.add(st);
		}
    	
    	ArrayList<Integer> ans = new ArrayList<Integer>();
   
    	for (Stage s : ts) {
    		ans.add(s.stageNum);
    	}
    	
    	int[] realAns = new int[ans.size()];
    	
    	for (int i = 0; i < realAns.length; i++) {
			realAns[i] = ans.get(i);
		}
    	
        return realAns;
    }
    
	public static void main(String[] args) {
		new Failure();
	}
}
