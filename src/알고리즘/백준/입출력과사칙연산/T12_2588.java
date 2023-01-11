package 알고리즘.백준.입출력과사칙연산;

import java.util.Scanner;

// 곱셈
public class T12_2588 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        input.close();

        System.out.println(firstNum * (secondNum % 10));
        System.out.println(firstNum * ((secondNum % 100) / 10));
        System.out.println(firstNum * (secondNum / 100));
        System.out.println(firstNum * secondNum);
    }
}
