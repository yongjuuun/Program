package 알고리즘.프로그래머스.Lv2;

import java.util.ArrayList;

public class T26_뉴스클러스트링 {
    public static void main(String[] args) {

//  자카드 유사도 = 교집합 크기 / 합집합 크기
//        1. 문자열을 두 글자씩 끊기
//        2. 공백, 숫자, 특수문자 들어있으면 글자 쌍 버리기
//        3. 대소문자 구분 없이 통일 후 비교
//        4. 최종 값에서 내림 후 정수부만 출력

        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        int answer = 0;
        double db = 0.0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        ArrayList<String> temp1 = new ArrayList<>();
        ArrayList<String> temp2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();    // 합집합
        ArrayList<String> intersecion = new ArrayList<>();  // 교집합

        // O(n)
        for (int i = 1; i < str1.length(); i++) {
            char first = str1.charAt(i - 1);
            char second = str1.charAt(i);

            if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
                temp1.add(first + "" + second);
            }
        }

        // O(n)
        for (int i = 1; i < str2.length(); i++) {
            char first = str2.charAt(i - 1);
            char second = str2.charAt(i);

            if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
                temp2.add(first + "" + second);
            }
        }

        // O(n)
        for (String x : temp1) {
            if (temp2.contains(x)) {
                temp2.remove(x);
                intersecion.add(x);
            }
            union.add(x);
        }

        // O(n)
        for (String x : temp2) {
            union.add(x);
        }
        // O(1)
        if (union.size() == 0) {
            answer = 1 * 65536;
        } else {
            db = (double) intersecion.size() / (double) union.size() * 65536.0;
            answer = (int) db;
        }

        System.out.println(intersecion);
        System.out.println(union);
        System.out.println(answer);
        System.out.println(db);
    }
}
