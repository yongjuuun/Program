package 알고리즘.프로그래머스.Lv1;

import java.util.Arrays;

public class T_완주하지못한선수 {
    public static void main(String[] args) {
//        String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
//                if (completion[i] != participant[i]) {
                answer = participant[i];
                break;
            }

            if (i == completion.length - 1) {
                answer = participant[i + 1];
            }
        }

        System.out.println(answer);
    }
}
