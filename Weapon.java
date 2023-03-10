//문제: https://school.programmers.co.kr/learn/courses/30/lessons/136798

public class Weapon {
    public Weapon() {
        System.out.println(solution(5, 3, 2));
        System.out.println(solution(10, 3, 2));
    }

    public int solution(int number, int limit, int power) {
        int answer = 1;

        for (int i = 2; i <= number; i++) {

            int attack = 0;
            for (int j = 1; j <= i / 2; j++) {

                if (i % j == 0) {
                    attack++;
                }

                if (attack >= limit) {
                    break;
                }
            }

            attack++;
            answer += attack > limit ? power : attack;

        }

        return answer;
    }

    public static void main(String[] args) {
        new Weapon();
    }
}
