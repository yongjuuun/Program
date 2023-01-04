package 프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.HashMap;


//1. split 으로 나누기
//2. hash 사용해서 해당 key 값 나오면 값 추가
//3. value 높은 순서대로 출력

public class T15_튜플 {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        int[] answer = {};

        // 정규식 사용 치환, trim 사용 앞/뒤 공백 제거, 배열로 split
        s = s.replaceAll("[{}]", " ").trim();
        String[] sa = s.split(" , ");

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < sa.length; i++) {
            for (int j = 0; j < sa[i].length(); j++) {
                int num = (int)sa[i].charAt(j);
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            }
        }

        System.out.println(hm);

//        for (int i = 0; i < hm.size(); i++) {
//            al.add(hm.get())
//        }

        for (String str : sa) {
            System.out.println(str);
        }
    }
}
