package 프로그래머스.Lv2;

import java.util.Arrays;

public class T_구명보트 {
    public static void main(String[] args) {
        // for 문으로 풀어봄
        int[] people = new int[] {70, 80, 50, 50};
        int limit = 100;

        int answer = 0;

        Arrays.sort(people);

        int j = people.length;
        for (int i = 0; i < j; i++) {
            if (people[i] + people[j - 1] <= limit) {
                j--;
                answer++;
            } else if (people[j - 1] <= limit) {
                j--;
                i--;
                answer++;
            }
        }
        System.out.println(answer);
    }
}

// deque 사용해서 풀어봄

//    int answer = 0;
//
//        Arrays.sort(people);
//                Deque<Integer> deque = new ArrayDeque<>(50000);
//        for(int x : people) {
//        deque.add(x);
//        }
//
//        while (deque.size() != 0) {
//        int heavy = deque.pollLast();
//        if (deque.size() != 0 && heavy + deque.getFirst() <= limit) {
//        deque.pollFirst();
//        }
//        answer++;
//        }
//
//        return answer;
//}