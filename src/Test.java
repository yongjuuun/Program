import java.util.*;

// HashMap key 값에 v, value 값에 arr 배열의 index 입력하고
// arr 배열에 인덱스 하나씩 +,- 해주면서 값 입력 해주기?
// 배열의 크기, 선언

public class Test {
    HashMap<Integer, Integer> hash = new HashMap<>();
    int[] temp = new int[5];
    int index = 0;

    int x = 0;

    // 활용 용도..
//    public Test() {
//    }

    public boolean insert(int v) {
        boolean result = false;

        if (hash.containsKey(v)) {
            result = false;
        } else {
            index++;
            int[] arr = new int[index];   // 배열 크기 정하는 부분
            hash.put(v, index - 1);
            arr[index - 1] = v;
            result = true;
        }

        System.out.println(v + " insert result : " + result);

        return result;
    }

    public boolean remove(int value) {
        boolean result = false;

        if (hash.containsKey(value)) {
            index--;
            int[] arr = new int[index];   // 배열 크기 정하는 부분
            hash.remove(value);
            result = true;
        } else {
            result = false;
        }

        System.out.println(value + " remove result : " + result);

        return result;
    }

    public int getRandom() {
        Random random = new Random();
        int[] arr = new int[index];   // 배열 크기 정하는 부분
        int randomNum = arr[random.nextInt(arr.length)];

        System.out.println("Random Num : " + randomNum);

        return randomNum;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.remove(1);
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
