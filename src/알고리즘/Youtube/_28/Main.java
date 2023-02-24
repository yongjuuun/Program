package 알고리즘.Youtube._28;

// 입력받은 10진수를 n진수로 변환시키시오.
// 19 16 ===> 19의 16진수 = 13

public class Main {
    public static void main(String[] args) {

        char n[] = new char[100];

        int inputNum = 38;
        int jinsu = 16;
        int i = 0;

        while (inputNum > 0) {
            int tmp = inputNum % jinsu;

            if (tmp >= 10 && tmp <= 15) {
                n[i] = (char) ('A' + (tmp - 10));
            } else {
                n[i] = (char) ('0' + tmp);
            }
            inputNum /= jinsu;
            i++;
        }

        for (; i >= 0; i--) {
            System.out.print(n[i]);
            System.out.println("안녕");
        }

    }
}
