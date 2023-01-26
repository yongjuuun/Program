package 알고리즘.프로그래머스.Lv2;

public class T5_이진변환반복하기 {
    public static void main(String[] args) {
        String s = "110010101001";

        int[] answer = new int[2];
        String temp = s;
        int zeroCnt = 0;
        int count = 0;
        int afterLength = 0;
        boolean check = true;

        while (check) {
            count++;
            afterLength = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '1') {
                    // temp += "1";
                    afterLength++;
                } else {
                    zeroCnt++;
                }
            }

            temp = Integer.toBinaryString(afterLength);

            if (temp.equals("1")) {
                check = false;
            }
        }
        answer[0] = count;
        answer[1] = zeroCnt;
    }
}
