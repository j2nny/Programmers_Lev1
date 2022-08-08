package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/82612

public class RollerCoaster {

	public RollerCoaster() {
		System.out.println(solution(3, 20, 4));
	}
	
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for (int i = 1; i <= count; i++) {
			answer += price * i;
		}

        return answer - money > 0 ? answer - money : 0;
    }
	
	public static void main(String[] args) {
		new RollerCoaster();
	}

}
