package 알고리즘.프로그래머스.Lv2;

// Success
import java.util.ArrayDeque;
import java.util.Deque;

public class T18_1차캐시 {
    public static void main(String[] args) {
        int cacheSize = 0;
        String[] cities = new String[] {"la", "la"};

        int answer = 0;

        Deque<String> dq = new ArrayDeque<>();

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
            if (!dq.contains(cities[i]) || cacheSize == 0) {
                if (dq.size() >= cacheSize) {
                    dq.pollLast();
                }
                dq.addFirst(cities[i]);
                answer += 5;
            } else {
                dq.remove(cities[i]);
                dq.addFirst(cities[i]);
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
