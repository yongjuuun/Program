package 포트폴리오.문자열;

public class Example2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(str1.equals(str2));
    }
}
