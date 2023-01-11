package 알고리즘.프로그래머스.Lv1;

public class T3_약수의합 {
    class Solution {
        public double solution(int[] arr) {
            double answer = 0;
            int n = arr.length;
            double avg = 0;

            for (int i = 0; i < n; i++) {
                avg += arr[i];
            }

            answer = avg / n;

            return answer;
        }
    }
}
