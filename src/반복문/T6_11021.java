package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 영수증
public class T6_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #" + (i + 1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + '\n');
        }

        br.close();
        System.out.println(sb);
    }
}
