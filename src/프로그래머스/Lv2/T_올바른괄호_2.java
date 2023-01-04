package 프로그래머스.Lv2;

// 최초 코드 효율성 테스트 실패
// => stack 코드로 수정

import java.util.Stack;

public class T_올바른괄호_2 {
    public static void main(String[] args) {
        String s = ")()(";
        boolean answer = false;

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.empty() && s.charAt(i) == ')') {
                stack.push("fail");
                break;
            } else if (s.charAt(i) == '(') {
                stack.push("(");
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }
        }

        if (stack.empty()) {
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
