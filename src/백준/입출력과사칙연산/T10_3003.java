package 백준.입출력과사칙연산;

import java.util.Scanner;

public class T10_3003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasKing = input.nextInt();
        int hasQueen = input.nextInt();
        int hasRook = input.nextInt();
        int hasBishop = input.nextInt();
        int hasNight = input.nextInt();
        int hasPawn = input.nextInt();

        System.out.print(1 - hasKing + " ");
        System.out.print(1 - hasQueen + " ");
        System.out.print(2 - hasRook + " ");
        System.out.print(2 - hasBishop + " ");
        System.out.print(2 - hasNight + " ");
        System.out.print(8 - hasPawn);
    }
}
