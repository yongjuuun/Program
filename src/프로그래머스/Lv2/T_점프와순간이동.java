package 프로그래머스.Lv2;

// 정답 추론하는 과정 생각 못해냄 - 나중에 다시
public class T_점프와순간이동 {
    public static void main(String[] args) {
        int answer = 0;

        int n = 10;

        while (n != 0) {
            if (n % 2 == 1) {
                answer++;
            }

            n /= 2;
        }

        System.out.println(answer);
    }
}
