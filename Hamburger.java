//문제: https://school.programmers.co.kr/learn/courses/30/lessons/133502

public class Hamburger {
    public Hamburger() {
        System.out.println(solution(new int[] { 2, 1, 1, 2, 3, 1, 2, 3, 1 }));
        System.out.println(solution(new int[] { 1, 3, 2, 1, 2, 1, 3, 1, 2 }));
    }

    public int solution(int[] ingredient) {

        StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);
            if (sb.length() > 3 && i == 1
                    && sb.charAt(sb.length() - 4) == '1'
                    && sb.charAt(sb.length() - 3) == '2'
                    && sb.charAt(sb.length() - 2) == '3') {
                sb = sb.delete(sb.length() - 4, sb.length());
            }
        }

        return (ingredient.length - sb.length()) / 4;
    }

    public static void main(String[] args) {
        new Hamburger();
    }
}
