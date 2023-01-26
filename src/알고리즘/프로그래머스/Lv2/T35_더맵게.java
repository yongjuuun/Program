package 알고리즘.프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class T35_더맵게 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : scoville) {
            pq.add(x);
        }

        int firstMin = 0;
        int secondMin = 0;
        for (int i = 0; i < pq.size(); i++) {
            firstMin = pq.poll();
        }
        System.out.println(firstMin);
    }
}
