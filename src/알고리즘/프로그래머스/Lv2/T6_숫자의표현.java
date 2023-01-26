package 알고리즘.프로그래머스.Lv2;

public class T6_숫자의표현 {
    public static void main(String[] args) {
        int n = 15; // -> 4

        int answer = 0;
        int sum = 0;

        for (int start = 1; start <= n; start++) {
            for (int i = start; i <= n; i++) {
                if (sum < n) {
                    sum += i;
                } else if (sum > n) {
                    break;
                }
                if (sum == n) {
                    answer++;
                    break;
                }
            }
            sum = 0;
        }
    }
}
