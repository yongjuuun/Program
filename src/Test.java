import java.util.*;


public class Test {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] answer = {};

        String[] strArr = {};
        s.replaceAll("[\\{,\\}]", "*");
        System.out.println(s);


    }
}