package 알고리즘.프로그래머스.Lv2;

import java.util.Arrays;

public class T_최소공배수 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 6, 8, 14};
        Arrays.sort(arr);
        int gcd, min, next= 0;
        int lcm = 1;

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
                    lcm = (min * next) / gcd;
                    arr[i] = lcm;
                    break;
                }
            }
        }

        System.out.println(lcm);
    }
}
