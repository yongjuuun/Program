package 알고리즘.프로그래머스.Lv1;

public class T4_자릿수더하기 {

    public class Solution {
        public int solution(int n) {
            int answer = 0;

            while (n > 0) {
                answer += n % 10;
                n /= 10;
            }

            return answer;
        }
    }
}
