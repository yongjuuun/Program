package 알고리즘.Youtube._25;

// N이 주어졌을 때 N 사이 사이클의 길이를 구하시오(1 <= N <= 100)
// 숫자 정해두고 1의자리 10의자리 더한 값을 일의자리에 넣고, 기존 값의 1의자리 를 십의자리에 넣고
// 같아질 때까지 반복 후 반복 횟수 출력

// 알고리즘 생각 하드 - 8.5
public class Main {
    public static void main(String[] args) {
        int n = 26;
        int res = n;
        int tmp = 0;

        int cnt = 0;

        do {
            tmp = res/10 + res%10;
            res = res%10 * tmp%10;
            cnt ++;
        } while (n != res);
    }
}
