package 알고리즘.프로그래머스.Lv2;

import java.util.HashMap;

public class T43_땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};      // 5 -> 7 -> 4

        int answer = 0;

        // DP (다이나믹 프로그래밍) 풀이법
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));   // 이전 줄 같은자리 뺀 숫자중 최대값 계산
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        for (int x : land[land.length - 1]) {
            answer = Math.max(answer, x);
        }

        System.out.println(answer);
    }
}
