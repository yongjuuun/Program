package 알고리즘.etc.Quiz;

import java.util.ArrayList;

public class oop {
    public static void main(String[] args) {
//        잡th님이 삼송폰을 샀습니다.
//        잡th님이 삼송폰을 켰습니다.
//        ★★★ 폰 켜지는 중 ★★★
//
//        거니님이 사과폰을 샀습니다.
//        거니님이 사과폰을 켰습니다.
//        @@@ 폰 켜지는 중 @@@

        int n = 2;
        ArrayList<String> ceo = new ArrayList<>();
        ceo.add("잡th");
        ceo.add("거니");

        String phoneModel = "";
        String character = "";

        for (int i = 0; i < ceo.size(); i++) {
            if (ceo.get(i).equals("잡th")) {
                phoneModel = "삼송폰";
                character = "★★★";
            } else if (ceo.get(i).equals("거니")) {
                phoneModel = "사과폰";
                character = "@@@";
            }

            String str = ceo.get(i) + "님이 " + phoneModel + "을 ";
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.println(str + "샀습니다.");
                } else if (j == 1) {
                    System.out.println(str + "켰습니다.");
                } else {
                    System.out.println(character + " 폰 켜지는 중 " + character);
                }
            }
            System.out.println();
        }
    }
}


