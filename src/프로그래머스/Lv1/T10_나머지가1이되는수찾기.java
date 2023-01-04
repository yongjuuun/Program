package 프로그래머스.Lv1;

public class T10_나머지가1이되는수찾기 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 2; i < n; i++) {
                if ((n % i) == 1) {
                    answer = i;
                    break;
                }
            }

            return answer;
        }
    }
}