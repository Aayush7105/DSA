import java.io.*;
import java.util.*;

public class test {

    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in = System.in;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = readByte();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = readByte();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int q = fs.nextInt();

            for (int i = 0; i < n; i++) fs.nextInt();

            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = fs.nextInt();

            long[] best = new long[n];
            best[n - 1] = b[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                best[i] = Math.max(b[i], best[i + 1]);
            }

            long[] prefix = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + best[i];
            }

            while (q-- > 0) {
                int l = fs.nextInt();
                int r = fs.nextInt();
                out.append(prefix[r] - prefix[l - 1]).append(' ');
            }
            out.append('\n');
        }

        System.out.print(out.toString());
    }
}
