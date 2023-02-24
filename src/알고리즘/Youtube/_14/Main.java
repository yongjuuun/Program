package 알고리즘.Youtube._14;

public class Main {
    public static void main(String[] args) {
        int n = 189186542;

        int arr[] = new int[10];

        while ( n>0 ) {
            arr[n%10]++;

        }

        for (int i=0; i<10; i++) {
            System.out.println(i+ " : "+arr[i]);
        }
    }
}
