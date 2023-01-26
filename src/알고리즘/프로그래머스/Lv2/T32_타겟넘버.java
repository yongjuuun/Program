//package 알고리즘.프로그래머스.Lv2;
//
//public class T32_타겟넘버 {
//    int[] numbers;
//    int target;
//    int answer;
//
//    void dfs(int index, int sum) {
//        // 탈출 코드 구현
//        if (index == numbers.length) {
//            if (sum == target) {
//                answer++;
//            }
//            return;
//        }
//
//        // 재귀함수 실행 코드
//        dfs(index + 1, sum + numbers[index]);
//        dfs(index + 1, sum - numbers[index]);
//    }
//
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 1, 1, 1, 1};
//        int target = 3;
//        int answer = 0;
//
//        this.numbers = numbers;
//        this.target = target;
//
//        dfs(0, 0);
//
//        System.out.println(answer);
//    }
//}
