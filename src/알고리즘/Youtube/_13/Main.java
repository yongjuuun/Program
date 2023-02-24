package 알고리즘.Youtube._13;

public class Main {
    public static void main(String[] args) {

        int n = 3;
        int arr[][] = new int[n][n];

        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
