package 알고리즘.프로그래머스.Lv2;

import java.util.*;

public class T33_귤고르기 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3}; //1 2 3 4 5

        // 2, [1, 1, 1, 1, 2, 2, 2, 3]

        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        // O(N)
        for (int i = 0; i < tangerine.length; i++) {
            hm.put(tangerine[i], hm.getOrDefault(tangerine[i], 0) + 1);
        }

        ArrayList<Integer> al = new ArrayList<>(hm.keySet());
        System.out.println(hm.keySet());

        al.sort(((o1, o2) -> hm.get(o2) - hm.get(o1)));     // * 정렬 방법 참고

        // O(N)
        for (int i = 0; i < al.size(); i++) {
            if (k <= 0) {
                break;
            } else {
                k -= hm.get(al.get(i));
                answer++;
            }
        }

        System.out.println(answer);
    }
}
