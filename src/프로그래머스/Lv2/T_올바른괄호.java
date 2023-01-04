package 프로그래머스.Lv2;

// 최초 코드 효율성 테스트 실패
// => stack 코드로 수정

public class T_올바른괄호 {
    public static void main(String[] args) {
        String s = "(())()";
        boolean answer = true;

        int left = 0;
        int right = 0;

        String[] sp = s.split("");

        if (!sp[0].equals("(") || !sp[s.length() - 1].equals(")")) {
            answer = false;
        }

        for(int i = 0; i < s.length(); i++) {
            if (sp[i].equals("(")) {
                left++;
            } else {
                right++;
            }

            // 차이점??
            // if ((left - rigth) == -1) {
            if (left == right - 1){
                answer = false;
            }
        }

        if (left != right) {
            // answer = false;
            answer = false;
        }

        System.out.println(answer);
    }
}
