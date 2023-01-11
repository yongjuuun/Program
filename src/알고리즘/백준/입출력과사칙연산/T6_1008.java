package 알고리즘.백준.입출력과사칙연산;

import java.util.Scanner;

public class T6_1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();

        if (0 < a && b < 10) {
            System.out.println(a / b);
        } else {
            System.out.println("0 < A, B < 10 에 맞게 재입력 하세요");
        }
    }
}
