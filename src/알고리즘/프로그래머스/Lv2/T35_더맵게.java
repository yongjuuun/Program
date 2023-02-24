package 알고리즘.프로그래머스.Lv2;

import java.util.PriorityQueue;

public class T35_더맵게 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : scoville) {
            pq.add(x);
        }

        int firstMin;
        int secondMin;
        int mixScov;
        while (pq.size() >= 2) {
            if (pq.peek() >= K) {
                break;
            }

            firstMin = pq.poll();
            secondMin = pq.poll();

            mixScov = firstMin + (secondMin * 2);

            pq.add(mixScov);

            answer++;

            if (pq.size() < 2 && mixScov < K) {
                answer = -1;
            }
        }

        System.out.println(answer);
    }
}
