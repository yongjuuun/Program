package 알고리즘.NC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1_재귀함수 {
    public static void main(String[] args) {
        String source = "execute";
        System.out.println(solution(source));
    }

    public static String solution(String str) {
        List<String> source = new ArrayList<String>(Arrays.asList(str.split("")));
        List<String> dest = new ArrayList<>();
        find_dup(source, dest);
        return "";
    }


    public static List<String> find_dup(List<String> source, List<String> dest) {
//        String[] sp = source.split("");

        if (source.size() == 0) {
            return dest;
        }

        List<String> dup = new ArrayList<>();
//        List<String> tempDest = new ArrayList<>();

        for (int i = 0; i < source.size(); i++) {
            if (source.contains(source.get(i))) {
                dup.add(source.get(i));
            } else {
                Collections.sort(source);
                dest.add(source.get(i));
            }
        }

//        char[] sortDest = tempDest.toCharArray();
//        Arrays.sort(sortDest);          // * sort 위치
//        tempDest = new String(sortDest);

//        dest += tempDest;
        return find_dup(dup, dest);        // * 다시 지워짐
    }
}
