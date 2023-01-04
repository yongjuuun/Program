package 프로그래머스.Lv2;

import java.util.PriorityQueue;

public class T_디펜스게임 {
    public static void main(String[] args) {
//        int n = 2;
//        int k = 4;
//        int[] enemy = new int[] {3, 3, 3, 3};

        int n = 7;
        int k = 3;
        int[] enemy = new int[]{4, 2, 4, 5, 3, 3, 1};

        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 무적권 = 라운드 / 올클
        if (k >= enemy.length) {
            answer = enemy.length;
        }

        for (int i = 0; i < enemy.length; i++) {
            pq.add(enemy[i]);
            if (i >= k) {
                n -= pq.poll();
                if (n < 0) {
                    answer = i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
