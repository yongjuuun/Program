package 알고리즘.프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 문제 헷갈림
public class T21_3차압축 {
    public static void main(String[] args) {
//        길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
//        사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾는다.
//        w에 해당하는 사전의 색인 번호를 출력하고, 입력에서 w를 제거한다.
//        입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c에 해당하는 단어를 사전에 등록한다.
//        단계 2로 돌아간다.

        String msg = "TOBEORNOTTOBEORTOBEORNOT";

        ArrayList<Integer> result = new ArrayList<>();
        Map<String, Integer> index = new HashMap<>();

        // index 에 A ~ Z 초기화 등록
        char init = 'A';
        for (int i = 1; i <= 26; i++) {
            index.put(init + "", i);
            init++;
        }

        // 11, 1, 27, 15
        int i = 0;
        while (i <= msg.length()) {
            if (i == msg.length()) {
                result.add(index.get(msg.substring(i)));
                break;
            }
            for (int j = i + 1; j <= msg.length(); j++) {
                String next = msg.substring(i, j + 1);
                if (index.containsKey(next)) {
                    j++;
                } else {
                    Integer indexValue = index.get(msg.substring(i, j));
                    result.add(indexValue);  // result 에 그 전 value 출력해주기
                    index.put(next, index.size() + 1);// 없는 값 사전 추가
                    i = j - 1;
                    break;
                }
            }
            i++;
        }

        int[] answer = new int[result.size()];
        for (int x = 0; x < result.size(); x++) {
            answer[x] = result.get(x);
        }
    }
}
