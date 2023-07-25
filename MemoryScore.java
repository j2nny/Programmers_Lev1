import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/176963

public class MemoryScore {
    public MemoryScore() {
        System.out.println(solution(new String[] { "may", "kein", "kain", "radi" }, new int[] { 5, 10, 1, 3 },
                new String[][] { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
                        { "kon", "kain", "may", "coni" } }));
        // System.out.println(Arrays.toString(solution(new String[] {}, new int[] {},
        // new String[][] {})));
    }

    public List<Integer> solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        List<Integer> answer = new ArrayList<Integer>();

        for (String[] strings : photo) {
            int score = 0;
            for (String str : strings) {
                if (map.containsKey(str)) {
                    score += map.get(str);
                }
            }
            answer.add(score);
        }

        return answer;
    }

    public static void main(String[] args) {
        new MemoryScore();
    }
}