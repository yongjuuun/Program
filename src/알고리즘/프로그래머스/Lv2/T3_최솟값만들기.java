package 알고리즘.프로그래머스.Lv2;

import java.util.Arrays;

public class T3_최솟값만들기 {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        // 최솟값 나오는 방법 풀이 참고
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
    }
}
