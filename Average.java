package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12944

public class Average {
	
	public Average() {
		System.out.println(solution(new int[] {1, 2, 3, 4}));
		System.out.println(solution(new int[] {5, 5}));
	}
	
    public double solution(int[] arr) {
        double answer = 0;
        
        for (int i : arr) {
			answer += i;
		}
        
        return answer / arr.length;
    }

	public static void main(String[] args) {
		new Average();
	}

}
