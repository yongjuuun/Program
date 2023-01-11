package 알고리즘.백준.입출력과사칙연산;

import java.util.Scanner;

public class T7_10869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (1 <= a && b <= 10000) {
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        } else {
            System.out.println("(1 ≤ A, B ≤ 10,000) 맞게 재입력 하세요");
        }
    }
}
