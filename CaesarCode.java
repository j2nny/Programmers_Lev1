package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12926

public class CaesarCode {

	public CaesarCode() {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}

	public String solution(String s, int n) {

		String ans = "";

		for (int i : s.toCharArray()) {
			if(i >= 65 && i <= 90) {
				ans += (char)(i + n > 90 ? i + n - 26 : i + n);
			}
			
			else if(i >= 97 && i <= 122) {
				ans += (char)(i + n > 122 ? i + n - 26 : i + n);
			}
			
			else {
				ans += " ";
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		new CaesarCode();
	}

}
