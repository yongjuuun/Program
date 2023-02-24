package 알고리즘.Youtube._22;

// 입력된 수가 팰린드롬인지 판별하시오
// 가운데를 대칭으로해서 거꾸로해도 같은 숫자, 문자
//  220928 - 9
public class Main {
    public static void main(String[] args) {
        String num = "1222221";
        int length = num.length();
        boolean flag = false;

        for (int i=0; i<length/2; i++) {
            if ((num.charAt(i)) == (num.charAt(length-i-1)))   {
                flag = true;
            }
        }
        System.out.println(flag);

    }
}
