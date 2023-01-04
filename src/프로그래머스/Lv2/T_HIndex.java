package 프로그래머스.Lv2;

import java.util.Arrays;

public class T_HIndex {
    public static void main(String[] args) {
//        6, 5, 5, 5, 3, 2, 1, 0 - 4
//        3, 0, 6, 1, 5 - 3
//        5,3,3,8,10 - 3
        int answer = 0;
        int[] citations = {3, 0, 6, 1, 5};
        Arrays.sort(citations);


        for (int i = 0; i < citations.length; i++) {
            int index = citations.length - i;
            if (index <= citations[i]) {
                answer = index;
                break;
            }
        }

        System.out.println(answer);
    }
}


//Arrays.sort(citations);
//int[] citations = new int[]{10, 8, 5, 4, 3};
//        int answer = citations[0];
//        int num = citations[citations.length - 1];
//
//        for (int j = 0; j < num; j++) {
//        int max = j;
//        int upCnt = 0;
//        int dnCnt = 0;
//        for (int i = 0; i < citations.length; i++) {
//        if (max >= citations[i]) {
//        dnCnt++;
//        }
//
//        if (max <= citations[i]) {
//        upCnt++;
//        }
//
//        if (upCnt == max && dnCnt == max) {
//        if (max >= answer) {
//        answer = max;
//        }
//        }
//        }
//        if (dnCnt > upCnt) {
//        break;
//        }
//        }
