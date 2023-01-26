package 알고리즘.프로그래머스.Lv2;

import java.util.Arrays;

public class T27_전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};

        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        System.out.println(answer);
    }
}
