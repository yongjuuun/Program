package 알고리즘.프로그래머스.Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

// 2, 13~16 성공 나머지 실패
public class T39_주차요금계산 {
    public static void main(String[] args) {
//        ex1)
//        int[] fees = {180, 5000, 10, 600};  // 기본시간(분), 기본요금(원), 단위시간(분), 단위요금(분) // 올림처리
//        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        // 14600, 34400, 5000   차량번호가 작은 자동차부터 청구할 주차 요금 차례대로

//        ex2)
        int[] fees = {1, 461, 1, 10};
        String[] records = {"00:00 1234 IN"};

        HashMap<String, Integer> numTime = new HashMap<>();
        HashMap<String, Integer> money = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            String[] sp = records[i].split(" ");
            String[] noHour = sp[0].split(":");
            int minute = (Integer.parseInt(noHour[0]) * 60) + Integer.parseInt(noHour[1]);  // 시간 -> 분으로 합치기

            if (!numTime.containsKey(sp[1])) {
                numTime.put(sp[1], minute);
            } else {
                money.put(sp[1], minute - numTime.get(sp[1]));  // 주차 시간을 총 합산
                numTime.remove(sp[1]);
            }
        }

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

        // 정렬
        TreeMap<String, Integer> treeMap = new TreeMap<>(money);

        ArrayList<Integer> al = new ArrayList<>();
        for (String x : treeMap.keySet()) {
            al.add(money.get(x));
        }

        int[] answer = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) > fees[0]) {
                answer[i] = (int) (fees[1] + Math.ceil((al.get(i) - fees[0]) / (double) fees[2]) * fees[3]);
            } else {
                answer[i] = fees[1];
            }
        }

        for (int x : answer) {
            System.out.println(x);
        }


    }
}
