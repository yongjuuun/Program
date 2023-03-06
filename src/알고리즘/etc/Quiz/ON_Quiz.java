package 알고리즘.etc.Quiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

// O(1) 으로 insert, remove, random 명령에 대한 결과 출력하기
public class ON_Quiz {
    HashMap<Integer, Integer> hash = new HashMap<>();   // key = 입력 값, value = arraylist 의 index
    int[] array = new int[0];

    // 활용 용도..
//    public ON_Quiz() {
//    }

    public boolean insert(int v) {
        if (hash.containsKey(v)) {
            System.out.println(v + " insert false");
            return false;
        }

        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = v;
        hash.put(v, array.length - 1);

        System.out.println(v + " insert true");
        return true;
    }

    public boolean remove(int v) {
        if (!hash.containsKey(v)) {
            System.out.println(v + " remove false");
            return false;
        }

        int index = hash.get(v);
        hash.remove(v); // ok

        array[index] = array[array.length - 1]; // 제거하는 자리에 가장 마지막 값 입력

        hash.put(array[index], index);
        array = Arrays.copyOf(array, array.length - 1);
        System.out.println(v + " remove true");
        return true;
    }

    public int getRandom() {
        Random random = new Random();

        int randomNum = array[random.nextInt(hash.size())];

        System.out.println("randomNum : " + randomNum);

        return randomNum;
    }

    public static void main(String[] args) {
        ON_Quiz test = new ON_Quiz();
        test.insert(1);     // 1        ture
        test.insert(2);     // 1, 2     ture
        test.insert(3);     // 1, 2, 3  true
        test.remove(1);     // 2, 3     true
        test.insert(3);     // 2, 3     false
        test.remove(1);     // 2, 3     false
        test.remove(test.getRandom());  // 2 or 3 remove

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
