package 알고리즘.프로그래머스.Lv1;

import java.util.*;

public class T15_문자열내마음대로정하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] answer = new String[strings.length];

        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            al.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(al);

        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i).substring(1, al.get(i).length());
        }
    }

    // 처음에 원했던 답안
//    public String[] solution(String[] strings, int n) {
//        Arrays.sort(strings, new Comparator<String>(){
//            @Override
//            public int compare(String s1, String s2){
//                if(s1.charAt(n) > s2.charAt(n)) return 1;
//                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
//                else if(s1.charAt(n) < s2.charAt(n)) return -1;
//                else return 0;
//            }
//        });
//        return strings;
//    }
}
