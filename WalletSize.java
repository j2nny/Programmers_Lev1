package level1;

import java.util.ArrayList;
import java.util.Collections;

//문제: https://programmers.co.kr/learn/courses/30/lessons/86491

public class WalletSize {

	public WalletSize() {
		System.out.println(solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
	}
	
    public int solution(int[][] sizes) {
    	
    	ArrayList<Integer> width = new ArrayList<Integer>();
    	ArrayList<Integer> height = new ArrayList<Integer>();
    	
    	for (int[] arr : sizes) {
			if(arr[0] > arr[1]) {
				width.add(arr[0]);
				height.add(arr[1]);
			}else {
				width.add(arr[1]);
				height.add(arr[0]);
			}
		}
        return Collections.max(width) * Collections.max(height);
    }
	
	public static void main(String[] args) {
		new WalletSize();
	}

}
