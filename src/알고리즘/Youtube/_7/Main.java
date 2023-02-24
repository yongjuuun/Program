package 알고리즘.Youtube._7;

//소수 판별
//Mine - OK
//public class Main {
//    public static void main(String[] args) {
//
//        int sosoo = 18;
//        int mokCnt = 0;
//
//        for (int i=1; i<=sosoo; i++) {
//            if (sosoo % i == 0)
//                mokCnt += 1;
//        }
//
//        if (mokCnt <= 2)
//            System.out.println(sosoo + " is sosoo");
//        else
//            System.out.println(sosoo + " is not sosoo");
//
//    }
//}


public class Main {
    public static void main(String[] args) {
        int num = 15;
        boolean isPrimeNumber = true;

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
            }
        }

        if (isPrimeNumber) {
            System.out.println(num + "  is sosoo");
        } else {
            System.out.println(num + "  is not sosoo");
        }
    }
}