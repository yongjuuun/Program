package 알고리즘.Youtube._10;

public class Main {
    public static void main(String[] args) {

        int inputNum = 4;
        int i;
        int j;

        for (j=0; j<inputNum; j++) {
            for (i=0; i<inputNum; i++) {
                System.out.printf("%4d", j*inputNum + i + 1);
            }
            System.out.println();
        }
    }
}
