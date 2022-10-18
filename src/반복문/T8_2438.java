package BaekJoonCodingTest.src.반복문;

import java.util.Scanner;

// 별 찍기
public class T8_2438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
