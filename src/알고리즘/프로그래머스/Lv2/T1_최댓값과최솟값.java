package 알고리즘.프로그래머스.Lv2;

public class T1_최댓값과최솟값 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String[] sp = s.split(" ");
        int min = Integer.parseInt(sp[0]);
        int max = Integer.parseInt(sp[0]);
        int[] temp = new int[sp.length];

        for(int i = 1; i < sp.length; i++) {
            temp[i] = Integer.parseInt(sp[i]);
            if(temp[i] < min) {
                min = temp[i];
            } else if(temp[i] > max) {
                max = temp[i];
            }
        }
    }
}
