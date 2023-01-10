package 프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

// 1. split 으로 나누기
// 2.

// * 나중에 한번 더 풀어보기
public class T15_튜플 {
    public static void main(String[] args) {
        String s = "{{2,1,3},{2},{2,1},{2,1,3,4}}";

//        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        // 정규식 사용 치환, trim 사용 앞/뒤 공백 제거, 배열로 split
        s = s.replaceAll("[{}]", " ").trim();
        String[] sa = s.split(" , ");

        Arrays.sort(sa, (String s1, String s2) -> s1.length() - s2.length());

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (String x : sa) {
            String[] temp = x.split(",");
            for (int i = 0; i < temp.length; i++) {
                int n = Integer.parseInt(temp[i]);

                if (!list.contains(n)) {
                    list.add(n);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        for (int n : answer) {
            System.out.println(n);
        }
    }
}
