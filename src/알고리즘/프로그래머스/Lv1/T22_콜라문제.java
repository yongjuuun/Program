package 알고리즘.프로그래머스.Lv1;

public class T22_콜라문제 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;

        int answer = 0;


        int addBot = 0;
        int rest = 0;
        while (n >= a) {
            rest = n % a;
            addBot = (n / a) * b;
            n = addBot + rest;

            answer += addBot;
        }

        System.out.println(answer);
    }
}
