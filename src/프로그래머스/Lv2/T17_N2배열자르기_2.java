package 프로그래머스.Lv2;

// 1차 테스트 - 다수의 테스트 케이스 런타임 오류, 메모리 초과
public class T17_N2배열자르기_2 {
    public static void main(String[] args) {
        int n = 3;
        int left = 2;
        int right = 5;

        int[] answer = new int[(int)(right - left) + 1];

        for (int i = 0; i < answer.length; i++) {
            int row = (int)((i + left) / n) + 1; // 행
            int col = (int)((i + left) % n) + 1; // 열

            answer[i] = Math.max(row, col);
        }

        for (int y : answer) {
            System.out.print(y);
        }
    }
}
