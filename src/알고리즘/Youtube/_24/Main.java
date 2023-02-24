package 알고리즘.Youtube._24;

// 학생수와 점수들이 순서대로 입력된다. 평균보다 넘은 학생들의 비율을 출력하시오

// Mine(쓰레기코드 였는데 풀이랑 일치) - 5
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] score = {100,50,30,40,60};
        int total = 0;
        int avg = 0;
        double cnt = 0;
        double per = 0;

        for (int i=0; i<n; i++) {
            total += score[i];
        }

        avg = total / n;

        for (int i=0; i<n; i++) {
            if (score[i] > avg) {
                cnt += 1;
            }
        }

        per = cnt / n * 100;
        System.out.println(per);
    }
}

// 풀이
//public class Main {
//    public static void main(String[] args) {
//
//        int in[] = {7, 100, 95, 90, 80, 70, 60, 50};
//        int sum=0;
//
//        for (int i=1; i<in.length; i++) {
//            sum += in[i];
//        }
//
//        double avg = (double)sum / in[0];
//
//        int cnt = 0;
//
//        for (int i=1; i<in.length; i++) {
//            if (in[i] > avg) {
//                cnt++;
//            }
//        }
//
//        System.out.println(cnt/(double)in[0] * 100);
//    }
//}