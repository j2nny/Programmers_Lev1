package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/140108

public class SplitString {

    public SplitString() {
        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
        System.out.println(solution("aaabbaccccabba"));
    }

    public int solution(String s) {
        int answer = 0;

        char start = Character.MIN_VALUE;
        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (start == Character.MIN_VALUE) {
                start = c;
                cnt++;
            } else {
                cnt = c == start ? cnt + 1 : cnt - 1;
            }

            if (cnt == 0) {
                start = Character.MIN_VALUE;
                answer++;
            }
        }

        if (cnt > 0) {
            answer++;
        }

        return answer;

    }

    public static void main(String[] args) {
        new SplitString();
    }

}
