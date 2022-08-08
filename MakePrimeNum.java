package level1;

import java.util.ArrayList;

//문제: https://programmers.co.kr/learn/courses/30/lessons/12977

public class MakePrimeNum {
	
	public MakePrimeNum() {
		System.out.println(solution(new int[] {1, 2, 3, 5, 6, 7, 8}));
	}
	
	public int solution(int[] nums) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					System.out.println(nums[i]+", "+nums[j]+", "+nums[k]);
					System.out.println("	합: "+(nums[i]+nums[j]+nums[k]));
					int cnt = 0;
					for (int l = 1; l <= nums[i]+nums[j]+nums[k]; l++) {
						System.out.println("나눌 수: "+l);
						if((nums[i]+nums[j]+nums[k]) % l == 0) {
							cnt++;
							System.out.println("cnt: "+cnt);
						}
					}
					if(cnt==2) {
						arr.add(nums[i]+nums[j]+nums[k]);
					}
				}
			}
		}
        System.out.println(arr.toString());
        
        return arr.size();

    }

	public static void main(String[] args) {
		new MakePrimeNum();
	}

}
