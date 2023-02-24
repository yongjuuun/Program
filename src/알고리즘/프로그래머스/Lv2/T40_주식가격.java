package 알고리즘.프로그래머스.Lv2;

import java.util.Stack;

public class T40_주식가격 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
//        4, 3, 1, 1, 0

        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = count;
        }

        for (int x : answer) {
            System.out.println(x);
        }
    }
}
