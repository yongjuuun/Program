package 백준.반복문;

import java.util.Scanner;

// 합 구하기
public class T2_10950 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        int arr[] = new int[t];

        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            arr[i] = a + b;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
