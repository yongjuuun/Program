package 알고리즘.프로그래머스.Lv2;

public class T11_카펫 {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        int[] answer = new int[2];
        int divisor = brown + yellow;

        for (int i = 3; i < divisor; i++) { // i=가로, j=세로
            int j = divisor / i;

            if (i >= j && j >= 3 && ((i-2) * (j-2) == yellow)) {
                answer[0] = i;
                answer[1] = j;
            }
        }
    }
}
