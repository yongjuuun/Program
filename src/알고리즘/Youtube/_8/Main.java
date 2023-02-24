package 알고리즘.Youtube._8;

//팩토리얼 계산

//Mine - OK
public class Main {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;

        for (int i=1; i<=num; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}

