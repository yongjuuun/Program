package 알고리즘.프로그래머스.Lv1;

public class T21_크기가작은부분문자열 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        // 2

        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String temp = t.substring(i, i + p.length());
            if (Long.parseLong(p) >= Long.parseLong(temp)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
