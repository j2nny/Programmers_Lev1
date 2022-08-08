package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/76501

public class PlusMinus {

	public PlusMinus() {
		System.out.println(solution(new int[] {4,7,12}, new boolean[] {true,false,true}));
	}
	
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			}
			else {
				answer -= absolutes[i];
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		new PlusMinus();
	}

}
