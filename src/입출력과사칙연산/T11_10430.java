package BaekJoonCodingTest.src.입출력과사칙연산;
// 나머지

import java.util.Scanner;

public class T11_10430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((2 <= a && a <= 10000) && (2 <= b && b <= 10000) && (2 <= c && c <= 10000)) {
            System.out.println((a + b) % c);
            System.out.println(((a % c) + (b %c )) % c);
            System.out.println((a * b) % c);
            System.out.println(((a % c) * (b % c)) % c);
        } else {
            System.out.println("범위에 맞게 재입력 하세요");
        }
    }
}
