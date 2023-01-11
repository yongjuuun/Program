package 알고리즘.프로그래머스.Lv2;

// 실패(시간 초과 코드)
public class T_짝지어제거하기 {
    public static void main(String[] args) {
        String s = "baabaa";
        int answer = -1;

        int i = 1;

        StringBuffer sb = new StringBuffer(s);

        while (i < sb.length()) {
            if (sb.charAt(i) == sb.charAt(i - 1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i - 1);
                i = 1;
                continue;
            }
            i++;
        }

        if (sb.length() == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        System.out.println(answer);
    }
}


