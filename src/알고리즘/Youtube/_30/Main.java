package 알고리즘.Youtube._30;

// 입력된 숫자까지 + - 를 차례대로 반복하시오
// ex) 9 입력 ===> 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9

// Mine easy - 3
public class Main {
    public static void main(String[] args) {

        int num = 6;

        for (int i = 1; i <= num; i ++) {
            if ((i % 2) == 1) {
                if (i != num) {
                    System.out.printf("%2d " + "+", i);
                } else {
                    System.out.printf("%2d ", i);
                }
            } else {
                if (i != num) {
                    System.out.printf("%2d " + "-", i);
                } else {
                    System.out.printf("%2d ", i);
                }
            }

//             이 부분에서 아래처럼 break 걸면 마지막에 나올 수 있음
//            if (i == num) {
//                System.out.printf("%2d ", i);
//                break;
//            }
        }
    }
}