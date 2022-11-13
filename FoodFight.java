package level1;

public class FoodFight {
	
	//문제: https://school.programmers.co.kr/learn/courses/30/lessons/134240
	
	public FoodFight() {
		System.out.println(solution(new int[] {1, 3, 4, 6}));
		System.out.println(solution(new int[] {1, 7, 1, 2}));
	}
	
    public String solution(int[] food) {
    	
    	String answer = "";

    	for (int i = 1; i < food.length; i++) {
    		answer += (i+"").repeat(food[i]/2);
		}
    	
    	answer += "0";
    	
    	for (int i = food.length - 1; i > 0; i--) {
			answer += (i+"").repeat(food[i]/2);
		}
    	
        return answer;
    }
    
    public static void main(String[] args) {
		new FoodFight();
	}

}
