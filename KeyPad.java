package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/67256

public class KeyPad {
	
	public KeyPad() {
		System.out.println(solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
		System.out.println(solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
		System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
	}

    public String solution(int[] numbers, String hand) {
    	
    	String answer = "";
    	
    	int[] left = new int[] {3, 0};
    	int[] right = new int[] {3, 2};
    	
    	for (int num : numbers) {
			switch(num) {
			case 1: case 4: case 7:
				answer += "L";
				left = new int[]{(num-1)/3, (num-1)%3};
				break;
			case 3: case 6: case 9:
				answer += "R";
				right = new int[]{(num-1)/3, (num-1)%3};
				break;
			case 2: case 5: case 8:
				boolean isLeft = selectHand(left, right, new int[]{(num-1)/3, (num-1)%3}, hand).equals("left");
				answer += isLeft ? "L" : "R";
				if(isLeft) {
					left = new int[]{(num-1)/3, (num-1)%3};
				} else {
					right = new int[]{(num-1)/3, (num-1)%3};
				}
				break;
			 case 0:
				 isLeft = selectHand(left, right, new int[]{3, 1}, hand).equals("left");
					answer += isLeft ? "L" : "R";
					if(isLeft) {
						left = new int[]{3, 1};
					} else {
						right = new int[] {3, 1};
					}
				break;
			}
		}
    	
        return answer;
    }
    
    public String selectHand(int[] left, int[] right, int[] target, String hand) {
    	int distanceLeft = Math.abs(target[0]-left[0]) + Math.abs(target[1]-left[1]);
    	int distanceRight = Math.abs(target[0]-right[0]) + Math.abs(target[1]-right[1]);
    	
    	if(distanceLeft == distanceRight) {
    		return hand;
    	}
    	
    	return distanceLeft < distanceRight ? "left" : "right";
    }
	
	public static void main(String[] args) {
		new KeyPad();
	}
}
