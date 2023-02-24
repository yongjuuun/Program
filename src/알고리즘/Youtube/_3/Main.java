package 알고리즘.Youtube._3;

import java.util.Scanner;

//10개 입력값 후, 최빈수 숫자 출력
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int []inputnum = new int[10];
        for (int i=0; i<10; i++) {
            inputnum[i] = scan.nextInt();
        }

        int []mode = new int [10];

        for (int i=0; i<10; i++) {
            mode[inputnum[i]]++;
        }
        //mode[1] == 2
        //mode[2] == 4
        //mode[3] == 2
        //mode[4] == 2

        int modeNum = 0; //최빈수
        int modeCnt = 0; //최빈수가 나온 횟수

        for (int i=0; i<10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println("max : "+modeNum + " ,cnt : " + modeCnt);
    }
}
