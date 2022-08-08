package level1;

//문제: https://programmers.co.kr/learn/courses/30/lessons/12930

public class CrazyString {

	public CrazyString() {
		System.out.println(solution("try hello world "));
		System.out.println(solution("t tt ttt tttt ttttt tttttt ttttttt  "));
	}
	
    public String solution(String s) {
    	String ans = "";
    	
    	int cnt = 0;
    	for (char c : s.toCharArray()) {
    		ans += cnt % 2 == 0 ? (c+"").toUpperCase() : (c+"").toLowerCase();
    		cnt++;
    		
    		if((c+"").equals(" ")) {
    			cnt = 0;
    		}
		}
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		new CrazyString();
	}

}
