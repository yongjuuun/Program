package 알고리즘.해커랭크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class T1_PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        double pos = 0;
        double neg = 0;
        double zero = 0;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0) {
                pos++;
            } else if(arr.get(i) < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println(pos / arr.size());
        System.out.println(neg / arr.size());
        System.out.println(zero / arr.size());
    }
}

