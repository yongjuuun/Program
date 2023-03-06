package 알고리즘.etc.Practice;

public class sort {
    public static void main(String[] args) {
        // 오름차순 정렬
        int[] arr = {5, 7, 2, 1, 3, 8, 6};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    temp = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int x : arr) {     // 배열 출력
            System.out.println(x);
        }
    }
}
