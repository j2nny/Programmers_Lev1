package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/81301

public class StringAndEnglish {
	
	public StringAndEnglish() {
		System.out.println(solution("one4seveneight"));
	}
	
	public int solution(String s) {
		
        int answer = 0;
        
        for (int i = 0; i < 10; i++) {
        	s = s.replaceAll("zero,one,two,three,four,five,six,seven,eight,nine".split(",")[i], i+"");
		}
        answer = Integer.parseInt(s);
        
        return answer;
    }

	public static void main(String[] args) {
		new StringAndEnglish();
	}

}
