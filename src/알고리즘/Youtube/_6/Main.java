package 알고리즘.Youtube._6;

//최대공약수 구하기
public class Main {
    public static void main(String[] args) {

        int num1, num2;
        num1 = 36;
        num2 = 20;

        int small;
        int big;

        if (num1 > num2) {
            big = num1;
            small = num2;
        } else {
            big = num2;
            small = num1;
        }

        int gcd = 1; //최대공약수 초기화?

        for (int i=1; i <= small; i++) {
            if (big % i == 0 && small % i == 0)
                gcd = i;
        }

        System.out.println(gcd);

    }
}
