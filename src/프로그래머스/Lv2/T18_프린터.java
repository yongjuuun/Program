package 프로그래머스.Lv2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class T18_프린터 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
//        => answer = 1

        int answer = 0;

        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int x : priorities) {
            dq.add(x);
            al.add(x);
        }

        int firstNum = 0;
        for (int i = 0; i < al.size(); i++) {
            firstNum = al.get(0);

            if (firstNum < al.get(i)) {
                al.remove(0);
                al.add(al.size() - 1, firstNum);
            }
        }

        System.out.println(dq);
    }
}
