package 알고리즘.프로그래머스.Lv2;

import java.util.Arrays;

// * 나중에 한번 더 풀어보기
public class T22_튜플_2 {
    public static void main(String[] args) {
        String s = "{{2,1,3},{2},{2,1},{2,1,3,4}}";

        // 정규식 사용 치환, trim 사용 앞/뒤 공백 제거, 배열로 split
        s = s.replaceAll("[{}]", " ").trim();
        String[] sa = s.split(" , ");

        // 배열의 길이가 짧은 순으로 정렬
        // ex) 2    2,1     2,1,3       2,1,3,4
        Arrays.sort(sa, (String s1, String s2) -> s1.length() - s2.length());
        int[] answer = new int[sa.length];

        for (int j = 0; j < answer.length; j++) {
            String[] temp = sa[j].split(",");
            for (int i = 0; i < temp.length; i++) {
                int n = Integer.parseInt(temp[i]);

                if (!contains(temp, n)) {
                    answer[j] = n;
                }
            }
        }
    }

    public static boolean contains (String[] temp, int n){
        return Arrays.asList(temp).contains(n);
    }
}