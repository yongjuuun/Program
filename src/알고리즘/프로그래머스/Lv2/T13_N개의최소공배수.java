package 알고리즘.프로그래머스.Lv2;

public class T13_N개의최소공배수 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};

        int answer = 1;

        int gcd, min, next= 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                min = arr[i - 1];
                next = arr[i];
            } else {
                min = arr[i];
                next = arr[i - 1];
            }
            for (int j = min; j > 0; j--) {
                if (min % j == 0 && next % j == 0) {
                    gcd = j;
                    answer = (min * next) / gcd;
                    arr[i] = answer;
                    break;
                }
            }
        }
    }
}
