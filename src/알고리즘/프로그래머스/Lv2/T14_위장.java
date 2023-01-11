package 알고리즘.프로그래머스.Lv2;

import java.util.HashMap;
import java.util.Map;

// 경우의 수 구하는 방법 참고
// -> (a+1)(b+1)(c+1) - 1   >>> 종류 수 + 1 씩 곱하고 아무것도 안입었을 때의 -1

public class T14_위장 {
    public static void main(String[] args) {
        String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
            // clothes[i][1] 의 값이 없으면 1, 있으면 현재값 + 1
        }

        for (Integer value : map.values()) {
            answer *= value;
        }

        answer -= 1;

        System.out.println(answer);
    }
}
