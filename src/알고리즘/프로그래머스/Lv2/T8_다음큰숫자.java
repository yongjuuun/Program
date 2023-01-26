package 알고리즘.프로그래머스.Lv2;

public class T8_다음큰숫자 {
    public static void main(String[] args) {
        int n = 73;

        int answer = 0;

        Boolean flag = true;

        String firstBin = Integer.toBinaryString(n);
        int firstCnt = 0;

        int nextNum = n;
        int nextCnt = 0;

        for (int i = 0; i < firstBin.length(); i++) {
            if (firstBin.charAt(i) == '1') {
                firstCnt++;
            }
        }

        while (flag) {
            nextNum++;
            String nextBin = Integer.toBinaryString(nextNum);

            for (int i = 0; i < nextBin.length(); i++) {
                if (nextBin.charAt(i) == '1') {
                    nextCnt++;
                }
            }

            if (firstCnt == nextCnt) {
                flag = false;
            } else {
                nextCnt = 0;
            }
        }

        answer = nextNum;
    }
}
