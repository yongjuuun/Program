package 알고리즘.프로그래머스.Lv2;

// #추론 과정 풀이 참고함
public class T_멀리뛰기 {
    public static void main(String[] args) {
        int n = 4;

        int[] dp = new int[2000];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
