package 알고리즘.프로그래머스.Lv2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class T23_기능개발 {
    public static void main(String[] args) {
        int[] progresses = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5 , 10, 7};

        Deque<Integer> dq = new ArrayDeque<>();

//      # 남은 날 = (100 - progresses) / speeds 이 100이상이 되는날
        for (int i = 0; i < progresses.length; i++) {
            dq.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        ArrayList<Integer> al = new ArrayList<>();
        while (!dq.isEmpty()) {
            int cnt = 1;
            int day = dq.poll();
            int size = dq.size();
            for (int i = 0; i < size; i++) {
                if (!dq.isEmpty() && day >= dq.peek()) {
                    cnt++;
                    dq.poll();
                } else {
                    break;
                }
            }
            al.add(cnt);
        }

        int[] answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }

        for (int x : answer) {
            System.out.println(x);
        }
    }
}

//        예제)
//        progresses : [93, 30, 55]
//        speeds : [1, 30, 5]
//        return : [2, 1]

//        예제 1)
//        progresses : [40, 93, 30, 55, 60, 65]
//        speeds : [60, 1, 30, 5 , 10, 7]
//        return : [1,2,3]
//
//        예제 2)
//        progresses : [93, 30, 55, 60, 40, 65]
//        speeds : [1, 30, 5 , 10, 60, 7]
//        return : [2,4]
