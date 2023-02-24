package 알고리즘.프로그래머스.Lv1;

public class T19_2016년 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        // 2016년 1월 1일 금요일
        // TUE

        String answer = "";

        String[] dayWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] maxDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 0;
        for (int i = 0; i < a - 1; i++) {
            day += maxDay[i];
        }
        day += b - 1;
        answer = dayWeek[day % 7];

        System.out.println(answer);
    }
}
