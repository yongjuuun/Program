package BaekJoonCodingTest.src.조건문;

import java.util.Scanner;

// 알람 시계
public class T5_2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h = input.nextInt();
        int m = input.nextInt();

        input.close();

        if (m >= 45) {
            System.out.print(h + " " + (m-45));
        } else if ((m < 45) && (h > 0)) {
            System.out.println((h - 1) + " " + (60 - (45 - m)));
        } else {
            System.out.println((24 - h - 1) + " " + (60 - (45 - m)));
        }
    }
}
