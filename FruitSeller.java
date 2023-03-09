import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/135808

public class FruitSeller {
    public FruitSeller() {
        System.out.println(solution(3, 4, new int[] { 1, 2, 3, 1, 2, 3, 1 }));
        System.out.println("==");
        System.out.println(solution(4, 3, new int[] { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 }));
    }

    public int solution(int k, int m, int[] score) {

        Arrays.sort(score);

        int answer = 0;

        for (int i = score.length % m; i < score.length - m + 1; i += m) {
            answer += score[i] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        new FruitSeller();
    }
}
