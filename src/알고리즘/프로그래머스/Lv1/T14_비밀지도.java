package 알고리즘.프로그래머스.Lv1;

public class T14_비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        // ["#####","# # #", "### #", "# ##", "#####"]

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i]);        // %s (= String Formatting) %s 는 문자열 그대로 출력, % s 사이에 숫자를 붙이면 길이만큼 출력

            answer[i] = answer[i].replace('1', '#');
            answer[i] = answer[i].replace('0', ' ');
        }



        for (String x : answer) {
            System.out.println(answer);
        }
    }
}
