package 포트폴리오.문자열;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("test");
        String s2 = "test";

        String s3 = new String("test");
        String s4 = "test";

        System.out.println(s1.hashCode() == s2.hashCode()); //true

        s2 = s2 + " world"; // test world 인스턴스를 새로 생성 => 새로운 변수 주소를 가지고 생성된 인스턴스 주소 값으로 가짐
        System.out.println(s2);
        String s5 = "test world";   // 새로운 변수 주소를 앞에서 생성된 인스턴스 주소를 값으로 가짐

        System.out.println(s2==s5); // false
        System.out.println(s2.equals(s5));  //true
    }
}
