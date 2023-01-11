package 알고리즘.프로그래머스.Lv1;

public class T1_짝수와홀수 {
    class Solution {
        public String solution(int num) {
            String answer = "";
            if (num % 2 == 0) {
                answer = "Even";
            } else {
                answer = "Odd";
            }
            return answer;
        }
    }
}
