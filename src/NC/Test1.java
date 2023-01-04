package NC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        String source = "d";
        String[] sp = source.split("");
        String notDup = "";
        String Dup = "";

        for (int i = 0; i < sp.length; i++) {
            if (!notDup.contains(sp[i])) {
                notDup += sp[i];
            } else {
                Dup += sp[i];
            }
        }

        char[] dupArr = notDup.toCharArray();
        Arrays.sort(dupArr);
        notDup = new String(dupArr);

        char[] notDupArr = Dup.toCharArray();
        Arrays.sort(notDupArr);
        Dup = new String(notDupArr);

        String result = "";
        result = notDup + Dup;

        System.out.println(result);
    }
}
