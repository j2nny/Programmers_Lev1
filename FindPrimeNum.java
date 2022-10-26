package level1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindPrimeNum {

	public FindPrimeNum() {
		System.out.println(solution(10));
		System.out.println("===");
		System.out.println(solution(5));
	}

	public int solution(int n) {
		
        int answer = 0;
        
        int[] number = new int[n+1];
        
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }
        
        for(int i=2; i<=n; i++) {
            if(number[i]==0) continue;
            
            for(int j= 2*i; j<=n; j += i) {
                number[j] = 0;
            }
        }
        
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                answer++;
            }
        }
        
        return answer;
	}

	public static void main(String[] args) {
		new FindPrimeNum();
	}
}
