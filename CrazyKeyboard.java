import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/160586

public class CrazyKeyboard {

    public CrazyKeyboard() {
        System.out
                .println(Arrays.toString(solution(new String[] { "ABACD", "BCEFD" }, new String[] { "ABCD", "AABB" })));
        System.out.println(Arrays.toString(solution(new String[] { "AA" }, new String[] { "B" })));
        System.out.println(Arrays.toString(solution(new String[] { "AGZ", "BSSS" }, new String[] { "ASA", "BGZ" })));
    }

    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];

        int idx = 0;
        for (String target : targets) {
            int totalClick = 0;
            for (char ch : target.toCharArray()) {
                List<Integer> list = new ArrayList<>();
                for (String key : keymap) {
                    int click = key.indexOf(String.valueOf(ch));
                    if (click != -1) {
                        list.add(click);
                    }
                }

                if (list.isEmpty()) {
                    totalClick = -1;
                    break;
                } else {
                    totalClick += Collections.min(list) + 1;
                }
            }
            answer[idx++] = totalClick;
        }

        return answer;
    }

    public static void main(String[] args) {
        new CrazyKeyboard();
    }
}
