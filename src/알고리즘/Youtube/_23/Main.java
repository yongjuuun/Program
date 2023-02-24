package 알고리즘.Youtube._23;

//입력된 문자열을 뒤집어서 출력하시오
// ADEFH ===> HFEDA
// Mine - 7 (풀이 영상이랑 다름)
public class Main {
    public static void main(String[] args) {

        String str = "123456789";
        int length = str.length();
        Character arr[] = new Character[length];

        for (int i=0; i<length; i++) {

            arr[i] = str.charAt(length-i-1);
            System.out.print(arr[i]);
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//
//        String n = "ABCDE";
//        char str[] = n.toCharArray();
//        char tmp;
//        System.out.println(n);
//        int len = str.length;
//
//        for (int i=0; i<len/2; i++) {
//            tmp = str[i];
//            str[i] = str[len-i-1];
//            str[len-i-1] = tmp;
//        }
//
//        n = new String(str);
//        System.out.println(n);
//    }
//}
