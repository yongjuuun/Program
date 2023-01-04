package 프로그래머스.Lv2;

// 유추 하는 방법 참고
public class T_예상대진표 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int n = 8;

        int answer = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;

            answer++;
        }

        System.out.println(answer);
    }
}
