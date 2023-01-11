package 알고리즘.백준.반복문;

import java.util.Scanner;

// 팩토리얼
public class T3_8393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
