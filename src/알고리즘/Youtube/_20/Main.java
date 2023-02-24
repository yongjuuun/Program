package 알고리즘.Youtube._20;

// 100까지 369 게임을 아래와 같이 진행하시오.

// Mine - 8.5
//public class Main {
//    public static void main(String[] args) {
//        int n = 100;
//
//        for (int i=1; i<=n; i++) {
//            if ((i%10) == 3)
//
//            if ((i%10) == 3)   {
//                System.out.println("JJ");
//            } else if ((i%10) == 6) {
//                System.out.println("JJ");
//            } else if ((i%10) == 9) {
//                System.out.println("JJ");
//            } else {
//                System.out.printf("%2d", i);
//                System.out.println();
//            }
//        }
//    }
//}


public class Main {

    public static int getNum(int i) {
        int j = 0;

        while (i>0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                j++;
            }
            i /= 10;
        }
        return j;
    }


    public static void main(String[] args) {
        int n = 100;

        for (int i=1; i<=n; i++) {
            int cnt = getNum(i);

            if (cnt == 0) {
                System.out.println(i);
            } else {
                for (int l=0; l<cnt; l++) {
                    System.out.print("!!! ");
                }
                System.out.println();
            }
        }
    }
}
