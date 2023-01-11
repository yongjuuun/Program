package 알고리즘.NC;

import java.util.Arrays;

public class Test1_while {
    public static void main(String[] args) {
        String source = "execute";
        String dest = "";
        boolean flag = true;

        while (flag) {
            String[] sp = source.split("");
            String tempDest = "";
            String dup = "";

            for (int i = 0; i < sp.length; i++) {
                if (tempDest.contains(sp[i])) {
                    dup += sp[i];
                } else {
                    tempDest += sp[i];
                }
            }

            char[] sortDest = tempDest.toCharArray();
            Arrays.sort(sortDest);          // * sort 위치
            tempDest = new String(sortDest);

            dest += tempDest;

            source = dup;

            if (dup.equals("")) {
                flag = false;
            }
        }
        System.out.println(dest);
    }
}
