package 알고리즘.프로그래머스.Lv2;

public class T10_영어끝말잇기 {
    // ********** 테스트 20 실패 !!!!!!!!!!***************
    public static void main(String[] args) {
        int n = 2;
        String[] words = {"qwe", "eqwe", "eqwe"};

        int[] answer = new int[2];  // [번호, 차례]
        int i = 0;
        StringBuffer dup = new StringBuffer();

        while (i != words.length) {
            String s2 = words[i];
            if (i != 0) {
                String s1 = words[i - 1];
                String x = dup.toString();
                String y = s2.toString();

                if (x.contains(y)) {
                    break;
                }

                if (s2.length() <= 1) {
                    break;
                }

                if (s2.charAt(0) != s1.charAt(s1.length() - 1)) {
                    break;
                }
            }
            dup.append(s2);
            dup.append(" ");

            i++;
        }

        if (i == words.length) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = (i % n) + 1;
            answer[1] = (i / n) + 1;
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}


// 성공 코드 for 문으로 수정
//import java.util.*;
//
//class Solution {
//    public int[] solution(int n, String[] words) {
//        int[] answer = new int[2];  // [번호, 차례]
//        List<String> dup = new ArrayList<>();
//        boolean flag = true;
//
//        dup.add(words[0]);
//
//        for (int i = 1; i < words.length; i++) {
//            if (dup.contains(words[i])
//                    || words[i].length() < 2
//                    || words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
//                answer[0] = (i % n) + 1;
//                answer[1] = (i / n) + 1;
//                flag = false;
//                break;
//            }
//            dup.add(words[i]);
//        }
//
//        if (flag) {
//            answer[0] = 0;
//            answer[1] = 0;
//        }
//
//        return answer;
//    }
//}