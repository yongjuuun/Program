package 알고리즘.프로그래머스.Lv2;

import java.util.Stack;

public class T20_괄호회전하기 {
    public static void main(String[] args) {
        String s = "[](){}";
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            stack.clear();

            if (j > 0) {
                s = s.substring(1, s.length()) + s.charAt(0);
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                    stack.add(s.charAt(i));
                } else if (stack.empty() && (s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}')) {
                    stack.add('x');
                    break;
                } else if ((stack.peek() == '[' && s.charAt(i) == ']'
                        || (stack.peek() == '(' && s.charAt(i) == ')')
                        || (stack.peek() == '{' && s.charAt(i) == '}'))) {
                    {
                        stack.pop();
                    }
                }
            }

            if (stack.empty()) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
