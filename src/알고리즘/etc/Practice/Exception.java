package 알고리즘.etc.Practice;

import java.io.IOException;

public class Exception {
    class E {
        void throwArithmeticException() {
            throw new ArithmeticException();
        }

        void throwIOException1() {
            try {
                throw new IOException();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        void throwIOException2 () throws IOException {
            throw new IOException();
        }
    }
}
