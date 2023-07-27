package 알고리즘.코드업;

import java.util.Scanner;

public class T6078 {
    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            Scanner input = new Scanner(System.in);
            String n = input.next();

            if (n.equals("q")) {
                flag = false;
            }

            System.out.println(n);
        }
    }
}
