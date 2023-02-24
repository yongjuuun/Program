package 알고리즘.프로그래머스.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T18_두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!al.contains(numbers[i] + numbers[j])) {
                    al.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(al);
        int[] answer = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }

        for (int x : answer) {
            System.out.println(x);
        }
    }
}
