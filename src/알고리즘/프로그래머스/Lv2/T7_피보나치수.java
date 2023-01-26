package 알고리즘.프로그래머스.Lv2;

public class T7_피보나치수 {
    public static void main(String[] args) {
        int n = 3; // -> 2

        int answer = 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }

        answer = arr[n];
    }
}
