package 알고리즘.프로그래머스.Lv1;

public class T11_최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int answer = 0;

        int max = 0;
        int min = 0;

        for (int i = 0; i < sizes.length; i++) {
            int realMax = Math.max(sizes[i][0], sizes[i][1]);
            int realMin = Math.min(sizes[i][0], sizes[i][1]);

            if (realMax > max) {
                max = realMax;
            }

            if (realMin > min) {
                min = realMin;
            }
        }

        answer = max * min;

        System.out.println(answer);
    }
}
