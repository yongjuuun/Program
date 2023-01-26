package 알고리즘.프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 문제 헷갈림
public class T31_3차압축 {
    public static void main(String[] args) {
//        길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
//        사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾는다.
//        w에 해당하는 사전의 색인 번호를 출력하고, 입력에서 w를 제거한다.
//        입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c에 해당하는 단어를 사전에 등록한다.
//        단계 2로 돌아간다.

        String msg = "KAKAO";
        // KA -> KA 27, K 색인 값 출력
        // A

//        현재 입력(w)	다음 글자(c)	출력	사전 추가(w+c)
//        K	     A	            11	       27: KA
//        A	     K	            1	      28: AK
//        KA	 O	         27	    29: KAO
//        O		            15

        ArrayList<Integer> result = new ArrayList<>();
        Map<String, Integer> index = new HashMap<>();

        // index 에 A ~ Z 초기화 등록
        char init = 'A';
        // O(N)
        for (int i = 1; i <= 26; i++) {
            index.put(init + "", i);
            init++;
        }

        // O(N)
        for (int i = 0; i < msg.length(); i++) {
           int end = i + 1;

           // O(N^2)
            while (end <= msg.length()) {
                if (end == msg.length()) {
                    result.add(index.get(msg.substring(i)));
                    i = end;
                    break;
                }

                // KA
                String next = msg.substring(i, end + 1);

                if (index.containsKey(next)) {
                    end++;
                } else {
                    result.add(index.get(msg.substring(i, end)));
                    index.put(next, index.size() + 1);
                    i = end - 1;
                    break;
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int x = 0; x < result.size(); x++) {
            answer[x] = result.get(x);
        }

        for (int x : answer) {
            System.out.println(x);
        }
    }
}
