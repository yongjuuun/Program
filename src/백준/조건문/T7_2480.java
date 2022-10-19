package 백준.조건문;

import java.util.Scanner;

// 주사위 세개
public class T7_2480 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        input.close();

        if ((a == b) && (b == c)) {
            System.out.println(10000 + (a * 1000));
        } else if ((a == b) || (a == c)) {
            System.out.println(1000 + (a * 100));
        } else if (b == c) {
            System.out.println(1000 + (b * 100));
        } else {
            int big = Math.max(a, Math.max(b, c));
            System.out.println(big * 100);
        }
    }
}