package 알고리즘.백준.반복문;
// 더하기 사이클


import java.util.Scanner;

public class T13_1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int result = 0;
        int init = x;
        int n = 0;
        int one = 0;
        int ten = 0;

        while (x != result) {

            if (x != result) {

            }
            int a = result / 10;
            int b = result % 10;

            one = a + b;

            result = (b * 10) + one;

            n++;
        }

        System.out.println(n);
    }
}
