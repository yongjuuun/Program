package 알고리즘.프로그래머스.Lv2;

import java.util.HashMap;

public class T41_할인행사 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int answer = 0;

        HashMap<String, Integer> hmDis = new HashMap<>();
        HashMap<String, Integer> hmWant = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            hmDis.put(discount[i], hmDis.getOrDefault(discount[i], 0) + 1);
        }
        for (int i = 0; i < want.length; i++) {
            hmWant.put(want[i], number[i]);
        }

        for (int i = 10; i < discount.length; i++) {
            int count = 0;

            for (String x : hmWant.keySet()) {
                if (hmWant.get(x) == hmDis.get(x)) {
                    count += hmWant.get(x);
                } else {
                    break;
                }
            }

            if (count == 10) {
                answer++;
            }

            // 위
            // * 위에 놓을때 아래 놓을때 미처리 해결법?
            hmDis.put(discount[i - 10], hmDis.get(discount[i - 10]) - 1);
            hmDis.put(discount[i], hmDis.getOrDefault(discount[i], 0) + 1);

            if (i == discount.length - 1) {
                // 아래
                count = 0;

                for (String x : hmWant.keySet()) {
                    if (hmWant.get(x) == hmDis.get(x)) {
                        count += hmWant.get(x);
                    } else {
                        break;
                    }
                }

                if (count == 10) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
