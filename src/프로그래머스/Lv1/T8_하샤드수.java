package 프로그래머스.Lv1;

public class T8_하샤드수 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int temp = x;
            int sum = 0;

            while (temp > 0) {
                sum += (temp % 10);
                temp /= 10;
            }

            if ((x % sum) == 0) {
                answer = true;
            } else {
                answer = false;
            }

            return answer;
        }
    }
}
