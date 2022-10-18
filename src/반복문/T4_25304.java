package BaekJoonCodingTest.src.반복문;

import java.util.Scanner;

// 영수증
public class T4_25304 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int n = input.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            total += (a * b);
        }

        if (total == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
