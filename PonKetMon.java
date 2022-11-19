package level1;

import java.util.HashSet;
import java.util.Set;

public class PonKetMon {
	
	public PonKetMon() {
		System.out.println(solution(new int[] {3,1,2,3}));
		System.out.println(solution(new int[] {3,3,3,2,2,4}));
		System.out.println(solution(new int[] {3,3,3,2,2,2}));
	}
	
    public int solution(int[] nums) {
    	
    	Set<Integer> set = new HashSet<Integer>();
    	
    	for (int num : nums) {
			set.add(num);
		}
    	
    	return nums.length/2 < set.size() ? nums.length/2 : set.size();
    	
    }

	public static void main(String[] args) {
		new PonKetMon();
	}
}
