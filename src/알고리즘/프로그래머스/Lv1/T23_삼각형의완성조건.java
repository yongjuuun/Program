package 알고리즘.프로그래머스.Lv1;

import java.util.Arrays;

public class T23_삼각형의완성조건 {
    public static void main(String[] args) {
        int[] sides = {1, 2, 3};

        int answer = 0;
        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else{
            answer = 2;
        }

        System.out.println(answer);
    }
}
