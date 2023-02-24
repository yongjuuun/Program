package 알고리즘.프로그래머스.Lv1;

import java.util.ArrayList;

public class T17_숫자문자열영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        int answer = 0;

        s = s.toLowerCase();

        String[] temp = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(temp[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);

        System.out.println(answer);
    }
}
