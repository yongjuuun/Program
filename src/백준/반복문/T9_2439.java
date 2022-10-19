package 백준.반복문;

import java.io.*;

// 별 찍기2
public class T9_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j > (n - i)) {
                    bw.write('*');
                } else {
                    bw.write(' ');
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
