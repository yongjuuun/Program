package 알고리즘.Youtube._16;

// 다음 입력 n을 받아 아래와 같은 *을 출력하시오
// OK
public class Main {
    public static void main(String[] args) {
        int n = 7;

        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
