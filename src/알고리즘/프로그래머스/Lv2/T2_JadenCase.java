package 알고리즘.프로그래머스.Lv2;

public class T2_JadenCase {
    public static void main(String[] args) {
        String s = "3people unFollowed me";

        String answer = "";

        s = s.toLowerCase();
        String[] sp = s.split("");

        StringBuffer sb = new StringBuffer();

        boolean space = false;

        for (int i = 0; i < sp.length; i++) {
            String temp = sp[i];
            if(i == 0) {
                sb.append(temp.toUpperCase());
            } else if (temp.isBlank()) {
                sb.append(" ");
                space = true;
            } else if (space) {
                sb.append(temp.toUpperCase());
                space = false;
            } else {
                sb.append(temp);
            }
        }
        answer = sb.toString();
    }
}
