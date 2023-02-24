package 알고리즘.프로그래머스.Lv1;

import java.util.ArrayList;

public class T24_옹알이 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        // "aya", "ye", "woo", "ma"
        int answer = 0;

        String[] word = {"aya", "ye", "woo", "ma"};
        String[] word2 = {"ayaaya", "yeye", "woowoo", "mama"};      // 중복방지

        ArrayList<String> x = new ArrayList<>();


        for (int i = 0; i < babbling.length; i++) {
            boolean flag = true;
            String temp = babbling[i];
            for (int j = 0; j < word.length; j++) {
                temp = temp.replace(word[j], "#");

            }

            for (int j = 0; j < temp.length(); j++) {
                if (!temp.subSequence(j, j + 1).equals("#")) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }

        }
        System.out.println(answer);

    }
}