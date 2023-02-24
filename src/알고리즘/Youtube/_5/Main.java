package 알고리즘.Youtube._5;

public class Main {
    public static void main(String[] args) {

        String input = "helloWorlD";
        char[] arr;
        arr = input.toCharArray();
        int interval = 'a' - 'A';

        System.out.print(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - interval);
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + interval);
            }

        }
        System.out.print(arr);

    }
}
