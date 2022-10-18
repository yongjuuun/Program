package BaekJoonCodingTest.src.조건문;

import java.util.Scanner;

public class T3_2753 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        input.close();

        if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
