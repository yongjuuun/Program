package 알고리즘.etc.Quiz;

import java.util.ArrayList;
import java.util.Random;

// O(1) 으로 insert, remove, random 명령에 대한 결과 출력하기
public class Test1 {
    ArrayList<Integer> save = new ArrayList<>();

    // 활용 용도..
//    public Test() {
//    }

    public boolean insert(int value) {
        boolean result = false;

        if (save.contains(value)) {
            result = false;
        } else {
            result = true;
        }

        System.out.println(value + " insert result : " + result);

        return result;
    }

    public boolean remove(int value) {
        boolean result = false;

        if(save.contains(value)) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(value + " remove result : " + result);

        return result;
    }

    public int getRandom() {
        Random random = new Random();
        int randomNUm = random.nextInt(20);

        System.out.println("Random Num : " + randomNUm);

        return randomNUm;
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.remove(1);
        test.insert(test.getRandom());
        test.remove(test.getRandom());

//        ex)
        // O(1)
        // 1 insert return true
        // 2 insert return true
        // 2 insert return false
        // 3 insert return true
        // 3 remove return true
        // 4 insert return true
        // 5 insert return true
        // 5 remove return true
        // 5 remove return false
        // 10 insert return true
    }
}
