package level1;

import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/17681

public class SecretMap {
	
	public SecretMap() {
		System.out.println(Arrays.toString(solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})));
		System.out.println(Arrays.toString(solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})));
	}

    public String[] solution(int n, int[] arr1, int[] arr2) {
    	
    	String[] arrStr1 = new String[n];
    	String[] arrStr2 = new String[n];
    	
    	for (int i = 0; i < n; i++) {
    		arrStr1[i] = "0".repeat(n - Integer.toBinaryString(arr1[i]).length()) + Integer.toBinaryString(arr1[i]);
    		arrStr2[i] = "0".repeat(n - Integer.toBinaryString(arr2[i]).length()) + Integer.toBinaryString(arr2[i]);
		}
    	
        String[] answer = new String[n];
    	
    	for (int i = 0; i < n; i++) {
    		String res = "";
    		for (int j = 0; j < n; j++) {
				if(arrStr1[i].charAt(j) == '0' && arrStr2[i].charAt(j) == '0') {
					res += " ";
				} else {
					res += "#";
				}
			}
    		answer[i] = res;
		}
    	
        return answer;
    }
    
	public static void main(String[] args) {
		new SecretMap();
	}
}
