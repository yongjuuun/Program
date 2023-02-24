package 알고리즘.Youtube._9;

public class Main {
    public static void main(String[] args) {

        int inputNum = 12368;
        int accSum = 0;

        while (inputNum > 0) {
            accSum += inputNum % 10;
            inputNum /= 10;
        }

        System.out.println(accSum);
    }
}
