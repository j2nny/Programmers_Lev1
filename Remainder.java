package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/87389

public class Remainder {
	
	public Remainder() {
		System.out.println(solution(10));
		System.out.println(solution(12));
	}
	
    public int solution(int n) {
    	
    	int ans = 0;
        
    	for (int i = 2; i < n; i++) {
			if(n%i==1) {
				ans = i;
				break;
			}
		}
    	
    	return ans;
    }

	public static void main(String[] args) {
		new Remainder();
	}

}
