package 알고리즘.프로그래머스.Lv1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T16_K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};   // 순서 = i, j, k     // i 번째 부터 j 번째 까지 정렬 후 k 번째 숫자

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                al.add(array[j]);
            }
            Collections.sort(al);
            answer[i] = al.get(commands[i][2] - 1);
        }

        for (int x : answer) {
            System.out.println(x);
        }

    }
}
