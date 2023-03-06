import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/150370

public class PersonalInfo {

    public PersonalInfo() {
        System.out.println(Arrays.toString(solution("2022.05.19", new String[] { "A 6", "B 12", "C 3" },
                new String[] { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" })));
        System.out.println(Arrays.toString(solution("2020.01.01", new String[] { "Z 3", "D 5" },
                new String[] { "2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z" })));
    }

    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String string : terms) {
            map.put(string.split(" ")[0], Integer.parseInt(string.split(" ")[1]));
        }

        int todayToDay = Integer.parseInt(today.split("[.]")[0]) * 12 * 28
                + Integer.parseInt(today.split("[.]")[1]) * 28
                + Integer.parseInt(today.split("[.]")[2]);

        int idx = 1;
        for (String string : privacies) {
            int keepDay = map.get(string.split(" ")[1]) * 28;

            String startDay = string.split(" ")[0];
            int totalDay = keepDay
                    + Integer.parseInt(startDay.split("[.]")[0]) * 12 * 28
                    + Integer.parseInt(startDay.split("[.]")[1]) * 28
                    + Integer.parseInt(startDay.split("[.]")[2]);

            if (totalDay <= todayToDay) {
                list.add(idx);
            }

            idx++;
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        new PersonalInfo();
    }

}
