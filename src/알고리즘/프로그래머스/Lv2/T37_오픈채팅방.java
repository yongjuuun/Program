package 알고리즘.프로그래머스.Lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T37_오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi"
                        , "Enter uid4567 Prodo"
                        , "Leave uid1234"
                        , "Enter uid1234 Prodo"
                        , "Change uid4567 Ryan"};
//        "Prodo님이 들어왔습니다."
//        , "Ryan님이 들어왔습니다."
//        , "Prodo님이 나갔습니다."
//        , "Prodo님이 들어왔습니다."

        Map<String, String> hm = new HashMap<>();
        int answerSize = 0;

        String order = "";
        String id = "";
        String nickname = "";

        for (int i = 0; i < record.length; i++) {
            String[] temp = record[i].split(" ");

            order = temp[0];
            id = temp[1];
            if (!order.equals("Leave")) {
                nickname = temp[2];
            }

            if (order.equals("Change")) {
                hm.put(id, nickname);
                answerSize++;
            } else if (order.equals("Enter")) {
                    hm.put(id, nickname);
            } else {

            }
        }

        String[] answer = new String[record.length - answerSize];

        int index = 0;      // Change 출력 부분 제외

        for (int i = 0; i < record.length; i++) {
            String[] temp = record[i].split(" ");

            order = temp[0];
            id = temp[1];
            nickname = hm.get(id);

            if (order.equals("Enter")) {
                answer[index++] = nickname + "님이 들어왔습니다.";
            } else if (order.equals("Leave")) {
                answer[index++] = nickname + "님이 나갔습니다.";
            }
        }

        for (String x : answer) {
            System.out.println(x);
        }
    }
}
