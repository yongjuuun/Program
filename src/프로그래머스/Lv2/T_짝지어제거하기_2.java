package 프로그래머스.Lv2;

import java.util.Stack;

public class T_짝지어제거하기_2 {
    public static void main(String[] args) {
        String s = "baabaa";
        int answer = -1;

        Stack<Character> stack = new Stack<>();

        // 문자열 길이가 홀수 일 때 리턴
//        if (s.length() % 2 != 0) {
//            answer = 0;
//            return;
//        }

        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.empty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == s.charAt(i)) {
                stack.pop();
            }
        }
        answer = stack.empty() ? 1 : 0;

        System.out.println(answer);
    }
}
