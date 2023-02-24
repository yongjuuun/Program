package 알고리즘.프로그래머스.Lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T20_폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};

        int answer = 0;

        Set<Integer> set = new HashSet<>();

        int numsLen = nums.length / 2;
        for (int x : nums) {
            set.add(x);
        }

        if (numsLen < set.size()) {
            answer = numsLen;
        } else {
            answer = set.size();
        }

        System.out.println(answer);
    }
}
