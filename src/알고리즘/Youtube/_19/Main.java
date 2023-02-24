package 알고리즘.Youtube._19;

// 다음 입력 n의 m승의 결과를 출력하시오
// OK - 2
public class Main {
    public static void main(String[] args) {
        int n = 2;
        int m = 8;
        int result = 1;

        for (int i= 0; i<m; i++) {
            result *= n;
        }

        System.out.println(result);
    }
}
