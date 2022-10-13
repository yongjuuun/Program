package 조건문;

import java.util.Scanner;

// 오븐 시계
public class T6_2525 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h = input.nextInt();
        int m = input.nextInt();
        int plusM = input.nextInt();

        //input.close();

        int totalM = (h * 60) + m;

        plusM += totalM;

        h = (plusM / 60) % 24;
        m = plusM % 60;

        System.out.print(h + " " + m);
    }
}
