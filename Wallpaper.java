import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/161990

public class Wallpaper {
    public Wallpaper() {
        System.out.println(Arrays.toString(solution(new String[] { ".#...", "..#..", "...#." })));
        System.out.println(Arrays.toString(
                solution(new String[] { "..........", ".....#....", "......##..", "...##.....", "....#....." })));
        System.out.println(Arrays.toString(solution(new String[] { ".##...##.", "#..#.#..#", "#...#...#", ".#.....#.",
                "..#...#..", "...#.#...", "....#...." })));
        System.out.println(Arrays.toString(solution(new String[] { "..", "#." })));
    }

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[] { -1, -1, -1, -1 };

        int idx = 0;
        for (String row : wallpaper) {

            if (!row.contains("#")) {
                idx++;
                continue;
            }

            if (answer[0] == -1) {
                answer[0] = idx;
            }

            answer[2] = idx + 1;

            if (answer[1] == -1 || row.indexOf("#") < answer[1]) {
                answer[1] = row.indexOf("#");
            }

            if (answer[3] == -1 || row.lastIndexOf("#") + 1 > answer[3]) {
                answer[3] = row.lastIndexOf("#") + 1;
            }

            idx++;
        }

        return answer;
    }

    public static void main(String[] args) {
        new Wallpaper();
    }
}
