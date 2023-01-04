package 프로그래머스.Lv1;

public class T5_정수제곱근판별 {

    class Solution {
        public long solution(long n) {
            long answer = 0;

            for (long x = 1; x <= (n / x); x++) {
                if (n == (x * x)) {
                    answer = (x + 1) * (x + 1);
                    break;
                } else {
                    answer = -1;
                }
            }
            return answer;
        }
    }

}
