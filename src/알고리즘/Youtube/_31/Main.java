package 알고리즘.Youtube._31;

import java.util.Scanner;

// 입력된 수의 팩토리얼을 구하시오( 재귀 version )
// 5 ===> 120
public class Main {
    public static int calFact(int i) {
        //    탈출 조건 필수
        if (i == 1) {

            return 1;
        }

        return i * calFact(i-1);
    }

    public static void main(String[] args) {

        int input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        int ans = 0;

        ans = calFact(input);


        System.out.println(ans);

    }
}