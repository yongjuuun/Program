package 알고리즘.Youtube._21;

//1~100 까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하시오.
// 1 2 3 1 1 2 3 4 5 5 ==> 1 2 3 4 5 출력
public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 8, 3, 8};
//        int[] cnt = {};
//
//        for (int i=0; i<10; i++) {
//            if (arr[i] == )
//        }

        boolean arr[] = new boolean[10];
        int inArr[] = new int [10];
        inArr[0] = 1;
        inArr[1] = 3;
        inArr[2] = 5;
        inArr[3] = 7;
        inArr[4] = 7;
        inArr[5] = 9;
        inArr[6] = 9;
        // ex) 1 3 5 7 9

        for (int i =0; i< inArr.length; i++) {
            arr[inArr[i]] = true;

            if (arr[i]) {
                System.out.println(i);
            }
        }
//        for (int i=1; i<=10; i++) {
//
//        }






    }
}
