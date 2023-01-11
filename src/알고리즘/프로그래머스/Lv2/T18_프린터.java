//package 알고리즘.프로그래머스.Lv2;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Deque;
//
//public class T18_프린터 {
//    public static int main(String[] args) {
//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;
////        => answer = 1
//
//        int answer = 0;
//
//        Deque<Integer> dq = new ArrayDeque<>();
//        ArrayList<Integer> al = new ArrayList<>();
//
//        for (int x : priorities) {
//            dq.add(x);
//            al.add(x);
//        }
//
//        int firstNum = 0;
//        boolean finish = false;
//
//
//        while (!dq.isEmpty()) {
//            firstNum = dq.peek();
//            boolean flag = false;
//            int index = 0;
//
//            for (int x : dq) {
//                if (x > firstNum) {
//                    flag = true;
//                    break;
//                }
//            }
//
//            if (flag) {
//                int temp = dq.poll();
//                dq.add(temp);
//                index++;
//            } else {
//                answer++;
//                Pair pair = dq.poll();
//
//                if (index == location) {
////                    return answer;
//
//                    finish = true;
//                    break;
//                }
//            }
//
//            if (finish) {
//                break;
//            }
//        }
//
//        System.out.println(answer);
//    }
//}
//
//class Pair {
//    int index;
//    int value;
//
//    public Pair(int index, int value) {
//        this.index = index;
//        this.value = value;
//    }
//}
