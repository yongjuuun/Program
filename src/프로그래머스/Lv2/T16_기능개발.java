package 프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.Stack;

public class T16_기능개발 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 2};

        int[] answer = {};

        ArrayList<Integer> al = new ArrayList<>();
        int finish = 0;

        Stack<Integer> st = new Stack<>();

        // stack에 역순으로 값 push
        for (int i = progresses.length - 1; i >= 0; i--) {
            st.push(progresses[i]);
        }

/*
남은 날 = (100 - progresses) / speeds 이 100이상이 되는날


 */

        int day = 0;
        // stack 가 없어질 때 까지
        while (!st.empty()) {
            int cnt = 0;
            // speed 값 더해주기
            for (int i = 1; i < st.size(); i++) {
                st.set(st.size() - i, )
            }

            for (int i = 0; i < st.size(); i++) {
                if (st.peek() >= 100) {
                    st.pop();
                    cnt++;
                } else {
                    cnt = 0;
                    break;
                }
            }
        }

        System.out.println(st);
//        System.out.println(answer);
    }
}
