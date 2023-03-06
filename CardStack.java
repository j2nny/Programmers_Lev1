import java.util.LinkedList;
import java.util.Queue;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/159994

public class CardStack {
    public CardStack() {
        System.out.println(solution(new String[] { "i", "drink", "water" }, new String[] { "want", "to" },
                new String[] { "i", "want", "to", "drink", "water" }));
        System.out.println(solution(new String[] { "i", "water", "drink" }, new String[] { "want", "to" },
                new String[] { "i", "want", "to", "drink", "water" }));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> queue1 = new LinkedList<>();
        for (String string : cards1) {
            queue1.offer(string);
        }

        Queue<String> queue2 = new LinkedList<>();
        for (String string : cards2) {
            queue2.offer(string);
        }

        String str1 = queue1.poll();
        String str2 = queue2.poll();

        for (String word : goal) {
            if (str1.equals(word)) {
                if (!queue1.isEmpty()) {
                    str1 = queue1.poll();
                }
            } else if (str2.equals(word)) {
                if (!queue2.isEmpty()) {
                    str2 = queue2.poll();
                }
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        new CardStack();
    }

}
