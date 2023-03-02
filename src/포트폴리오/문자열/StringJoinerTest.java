package 포트폴리오.문자열;

import java.util.Locale;
import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        //    StringJoiner sj =
        String cars = "hyundai,mercedes,bmw,tesla";
//        String[] arr = cars.split(",");

//        String str = String.join(" -", arr);
//        System.out.println(str);
        System.out.println(input(cars));

        StringJoiner sj = new StringJoiner(",","[","]");
        String[] carArr = {"hyundai", "mercedes","bmw","tesla"};

        for (String s : carArr) {
            sj.add(s.toUpperCase(Locale.ROOT));
        }
        System.out.println(sj);

    }

    static String input(String str) {
        String[] arr = str.split(",");
        return String.join("-", arr);


    }
}
