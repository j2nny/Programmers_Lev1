package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12915

public class SortStringMyMom {
	
	public SortStringMyMom() {
		System.out.println(Arrays.toString(solution(new String[] {"sun", "bed", "car"}, 1)));
		System.out.println(Arrays.toString(solution(new String[] {"abcd", "abce", "cdx"}, 2)));
	}
	
	class Com implements Comparator{
		
		int idx;
		
		public Com(int idx) {
			this.idx = idx;
		}
		
		@Override
		public int compare(Object o1, Object o2) {
			
			int res = 0;
			
			res = ((String) o1).split("")[idx].compareTo(((String) o2).split("")[idx]);
			
			if(res==0) {
				res = ((String) o1).compareTo((String) o2);
			}
			
			return res;
		}
		
	}
	
    public String[] solution(String[] strings, int n) {
    	
    	TreeSet<String> ts = new TreeSet<String>(new Com(n));
    	
    	for (String string : strings) {
			ts.add(string);
		}
    	
    	String[] answer = new String[ts.size()];

    	int i = 0;
    	for (String str : ts) {
    		answer[i] = str;
    		i++;
		}
    	
        return answer;
    }

	public static void main(String[] args) {
		new SortStringMyMom();
	}

}
