package 알고리즘.프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class T39_주차요금계산_2 {
    public static void main(String[] args) {
//        ex1)
        int[] fees = {180, 5000, 10, 600};  // 기본시간(분), 기본요금(원), 단위시간(분), 단위요금(분) // 올림처리
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
//         14600, 34400, 5000   차량번호가 작은 자동차부터 청구할 주차 요금 차례대로

//        ex2)
//        int[] fees = {1, 461, 1, 10};
//        String[] records = {"00:00 1234 IN"};

//        ex3)
//        int[] fees = {180, 5000, 10, 600};
//        String[] records = {"05:34 5961 IN", "06:34 5961 OUT", "07:34 5961 IN", "08:34 5961 OUT", "09:34 5961 IN", "10:34 5961 OUT", "11:34 5961 IN", "12:34 5961 OUT"};

        HashMap<String, Integer> numTime = new HashMap<>();
        TreeMap<String, Integer> money = new TreeMap<>();

        for (int i = 0; i < records.length; i++) {
            String[] sp = records[i].split(" ");
            String[] noHour = sp[0].split(":");
            int minute = (Integer.parseInt(noHour[0]) * 60) + Integer.parseInt(noHour[1]);  // 시간 -> 분으로 합치기
            int exist = 0;

            Integer ntMap = numTime.get(sp[1]);
            ntMap = ntMap == null ? 0 : ntMap;

            if (!numTime.containsKey(sp[1])) {  // 입차 할 때
                numTime.put(sp[1], minute);
            } else {                            // 출차 할 때
                if (money.containsKey(sp[1])) {
                    exist = money.get(sp[1]);
                    money.put(sp[1], minute - ntMap + exist);      // 출차 시간 - 입차시간 + 이전에 출입했던 시간
                } else {
                    money.put(sp[1], minute - ntMap);  // 주차 시간을 총 합산
                }
                numTime.remove(sp[1]);
            }
        }

        // 에러문제! - 같은차 들어왔다 나갔다 할 때 시간 누적인 안됨??
        int lastTime = 23 * 60 + 59;    // 11시 59분
        // 11:59 까지 출차가 안된 차량들 계산
        for (String x : numTime.keySet()) {
            if (money.containsKey(x)) {
                money.put(x, money.get(x) + lastTime - numTime.get(x));
            } else {
                money.put(x, lastTime - numTime.get(x));
            }
            numTime.remove(x);
        }

        int[] answer = new int[money.size()];

        int cnt = 0;
        for (String x : money.keySet()) {
            if (money.get(x) > fees[0]) {
                answer[cnt] =  fees[1] + (int)(Math.ceil((money.get(x) - fees[0]) / (double) fees[2]) * fees[3]);
            } else {
                answer[cnt] = fees[1];
            }
            cnt++;
        }

        for (int x : answer) {
            System.out.println(x);
        }

    }

}

