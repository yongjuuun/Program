package 알고리즘.Youtube._29;

// 1부터 8까지 차례대로 입력되면 ascending,
// 8부터 1까지 차례대로 입력되면 descending,
// 둘 다 아니라면 mixed를 출력하시오.

import java.util.Scanner;

// Mine 헷갈렸음 (풀이랑 다름) - 7
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input[] = new int[8];
        int arr[] = new int[8];

        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextInt();
            arr[i] = i + 1;
        }

        boolean ascending = true;
        boolean descending = true;
        
        for (int i = 0; i < input.length; i++) {
            if ((arr[i] - input[i]) != 0 ) {
                ascending = false;
            }

            if ((arr[i] - input[i]) != (input.length-1) ) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
