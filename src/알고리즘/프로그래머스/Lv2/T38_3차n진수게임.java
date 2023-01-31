package 알고리즘.프로그래머스.Lv2;

public class T38_3차n진수게임 {
    public static void main(String[] args) {
        int n = 16;  // 진법
        int t = 16;  // 미리 구할 숫자의 갯수
        int m = 2;  // 게임에 참가하는 인원
        int p = 1;  // 튜브의 순서

        String answer = "";

        StringBuffer sb = new StringBuffer();

        int num = 0;
        String temp = "";

        while (sb.length() <= t * m) {
            temp = Integer.toString(num, n);
            sb.append(temp);
            num++;
        }

        for (int i = p - 1; i < sb.length(); i += m) {
            answer += sb.charAt(i);

            if (answer.length() >= t) {
                break;
            }
        }
// 다른사람 풀이 같은 부분
//        for (int i=0; i<t; i++) {
//            retString += targetString.charAt(p - 1 + i * m);
//        }

        answer = answer.toUpperCase();

        System.out.println(answer);
    }
}
