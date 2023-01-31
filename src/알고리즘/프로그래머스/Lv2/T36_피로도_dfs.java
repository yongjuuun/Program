package 알고리즘.프로그래머스.Lv2;

//1. 세로(행) 길이 = 던전의 개수(1 ~ 8)
//2. 가로(열) 길이 = 2
//3. dungeons = 최소 필요 피로도, 소모 피로도
//4. 최소 필요 피로도 >= 소모 피로도

public class T36_피로도_dfs {
    static int answer = 0;
    static boolean[] visit;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        visit = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        System.out.println(answer);
    }

    public static int dfs(int index, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;        // 재방문이 안되기 때문에 중복처리 방지
                // O(C^n)
                dfs(index + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }

        answer = Math.max(index, answer);

        return answer;
    }
}
