package 알고리즘.프로그래머스.Lv2;

//1. 세로(행) 길이 = 던전의 개수(1 ~ 8)
//2. 가로(열) 길이 = 2
//3. dungeons = 최소 필요 피로도, 소모 피로도
//4. 최소 필요 피로도 >= 소모 피로도

import java.util.LinkedList;
import java.util.Queue;

public class T36_피로도_bfs {
    static int answer = 0;
    static boolean[] visit;
    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        visit = new boolean[dungeons.length];
        bfs(0, k, dungeons);

        System.out.println(answer);
    }

    public static int bfs(int index, int k, int[][] dungeons) {
        q.offer(index);
        visit[index] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            sb.append(x).append(" ");

            for (int i = 0; i < dungeons[x].length; i++){
                if (!visit[i] && dungeons[i][0] <= k) {
                    visit[i] = true;
//                    q.offer()
                }
            }
        }

        return answer;
    }
}
