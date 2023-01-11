package 알고리즘.프로그래머스.Lv2;

// 1차 테스트 - 다수의 테스트 케이스 런타임 오류, 메모리 초과
public class T17_N2배열자르기 {
    public static void main(String[] args) {
        int n = 3;
        int left = 2;
        int right = 5;

        int[] answer = new int[(int)(right - left) + 1];

        int num = 0;
        int x = 0;

        int[] arr1 = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    num = i + 1;
                } else {
                    num = j + 1;
                }
                arr1[x] = num;
                x++;
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i >= left && i <= right) {
                answer[cnt] = arr1[i];
                cnt++;
            } else if (i > right){
                break;
            }
        }

        for (int y : answer) {
            System.out.print(y);
        }
    }
}
