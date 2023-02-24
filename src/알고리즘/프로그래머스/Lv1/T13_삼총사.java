package 알고리즘.프로그래머스.Lv1;

public class T13_삼총사 {
    static int[] number = {-3, -2, -1, 0, 1, 2, 3};
    static int sum = 0;
    static int answer = 0;
    static int cnt = 0;
    static int[] temp = new int[3];

    public static void main(String[] args) {
        dfs(0, 0);

        System.out.println(answer);
    }

    private static void dfs(int index, int cnt) {
        if (cnt == 3) {
            for (int x : temp) {
                sum += x;
            }

            if (sum == 0) {
                answer++;
            }
            return;
        }

        for (int i = index; i < number.length; i++) {
            temp[cnt] = number[i];
            dfs(i + 1, cnt + 1);
        }
    }
}
