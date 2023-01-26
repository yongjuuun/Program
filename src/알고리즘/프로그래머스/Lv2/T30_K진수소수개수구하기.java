package 알고리즘.프로그래머스.Lv2;

public class T30_K진수소수개수구하기 {
    public static void main(String[] args) {
        int n = 437674;
        int k = 3;

//        0P0처럼 소수 양쪽에 0이 있는 경우
//        P0처럼 소수 오른쪽에만 0이 있고 왼쪽에는 아무것도 없는 경우
//        0P처럼 소수 왼쪽에만 0이 있고 오른쪽에는 아무것도 없는 경우
//        P처럼 소수 양쪽에 아무것도 없는 경우
//        단, P는 각 자릿수에 0을 포함하지 않는 소수입니다.
//        예를 들어, 101은 P가 될 수 없습니다.

//        * 테스트 케이스 1 번만 실패(=> 자료형 문제 parseInt(x), parseLong(o))

        int answer = 0;

        String convert = Integer.toString(n, k);    // n 을 k 진수로 변환 한 string

        String[] p = convert.split("0");    // 0을 기준으로 split -> 211, 2, 1, 1, 11

//        O(N)
        for (int i = 0; i < p.length; i++) {
            boolean sosu = true;
            long prime = 0;
            try { //
                prime = Long.parseLong(p[i]);   // 자료형 주의
            } catch (NumberFormatException e) {
            }

            if (prime < 2) {
                continue;
            }
            // 제곱근을 이용해서 2 ~ n(prime) 까지 소수인지 구하기
            // O(n^2), O(log N)
            for (int j = 2; j <= Math.sqrt(prime); j++) {
                if ((prime % j) == 0) {
                    sosu = false;
                    break;
                }
            }

            if (sosu) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
