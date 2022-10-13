package 입출력과사칙연산;

import java.util.Scanner;

public class T5_10998 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (0 < a && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("0 < A, B < 10 에 맞게 재입력 하세요");
        }
    }
}
