package 알고리즘.Youtube._12;

public class Main {
    public static void main(String[] args) {

        int n = 3;
        int arr[][] = new int[n][n];

        int num = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[j][i] = num;
                num += 1;             //방법 1
//                arr[j][i] = i*n + j+1;  //방법 2
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
