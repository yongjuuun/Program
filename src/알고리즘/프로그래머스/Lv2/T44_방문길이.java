package 알고리즘.프로그래머스.Lv2;

import java.util.HashMap;

// 1 차 실패 -> 왼쪽에서 간 길, 오른쪽에서 간 길 같은 길로 처리 필요

public class T44_방문길이 {
    public static void main(String[] args) {
        String dirs = "LULLLLLLU";

        int answer = 0;

        int x = 5;
        int y = 5;
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hmTemp = new HashMap<>();

        for (int i = 0; i < dirs.length(); i++) {
            String temp = "";
            Character cur = dirs.charAt(i);
            String bfX = String.valueOf(x);
            String bfY = String.valueOf(y);

            boolean repeatX = false;
            boolean repeatY = false;

            if (cur.equals('U')) {
                y++;
                repeatY = true;
            } else if (cur.equals('D')) {
                y--;
                repeatY = true;
            } else if (cur.equals('R')) {
                x++;
                repeatX = true;
            } else {
                x--;
                repeatX = true;
            }

            if (x < 0 || x > 10 || y < 0 || y > 10) {
                x = Integer.parseInt(bfX);
                y = Integer.parseInt(bfY);
                continue;
            }

            String afX = String.valueOf(x);
            String afY = String.valueOf(y);

            temp =  bfX + bfY + afX + afY;
            if (!hmTemp.containsKey(temp)) {
                hm.put(temp, hm.getOrDefault(temp, 0) + 1);
            }

            if (repeatX) {
                temp =  afX + bfY + bfX + afY;
                hmTemp.put(temp, hm.getOrDefault(temp, 0) + 1);
            } else if (repeatY) {
                temp =  bfX + afY + afX + bfY;
                hmTemp.put(temp, hm.getOrDefault(temp, 0) + 1);
            }
        }

        answer = hm.size();

        System.out.println(answer);

    }
}
