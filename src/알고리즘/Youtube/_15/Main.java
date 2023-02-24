package 알고리즘.Youtube._15;

//구구단 만들기
//구구단 시작 s부터 f단까지 입력 받아 아래와 같이 출력하시오
// OK
public class Main {
    public static void main(String[] args) {
        int s = 2;
        int f = 3;

        //mine
//        for(int i=s; i<f; i++) {
//            for(int j=1; j<10; j++) {
//                System.out.printf("%2d * %2d = %2d", i, j, i*j );
//                System.out.printf("%2d * %2d = %2d", i+1, j, (i+1)*j );
//                System.out.println();
//            }
//        }

        for (int i=1; i <=9; i++) {
            for (int dan=s; dan<=f; dan++) {
                System.out.printf("%d * %d = %d    ", dan, i, dan*i);
            }
            System.out.println();
        }
    }
}
