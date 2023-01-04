package 프로그래머스.Lv1;

public class T7_문자열내p와y의개수 {
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            s = s.toUpperCase();
            int pCnt = 0;
            int yCnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'P') {
                    pCnt++;
                } else if (s.charAt(i) == 'Y') {
                    yCnt++;
                }
            }

            if (pCnt == yCnt) {
                answer = true;
            } else if (pCnt != yCnt) {
                answer = false;
            }

            if (pCnt == 0 && yCnt == 0) {
                answer = true;
            }

            return answer;
        }
    }
}
