import java.io.*;
import java.util.*;
import java.lang.*;
public class Starters_14_Odd_GCD {

        static final int MOD = (int) 1e9 + 7;
        static final int INT_POSITIVE_INFINITY = Integer.MAX_VALUE;
        static final long LONG_POSITIVE_INFINITY = Long.MAX_VALUE;
        static final int INT_NEGATIVE_INFINITY = Integer.MIN_VALUE;
        static final long LONG_NEGATIVE_INFINITY = Long.MIN_VALUE;
        static StringBuilder result = new StringBuilder();

        static class Pair {
            int a;
            int b;

            public Pair(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }

        public static void main(String args[]) throws IOException {
            FastReader fr = new FastReader();

            int tc = fr.nextInt();
            while (tc-- > 0) {
                int n = fr.nextInt();
                int[] arr = new int[n];
                int opRequired = INT_POSITIVE_INFINITY;
                boolean oddPresent = false;

                for (int i = 0; i < n; i++) {
                    arr[i] = fr.nextInt();
                }

                if (oddPresent) {
                    result.append("0\n");
                    continue;
                }

                for (int i = 0; i < n; i++) {
                    opRequired = Math.min(opRequired, helper(arr[i]));
                }

                result.append(opRequired + "\n");
            }

            System.out.print(result);
        }

        static int helper(int n) {
            int res = 0;
            while (n % 2 == 0) {
                res++;
                n /= 2;
            }
            return res;
        }

        static class FastReader {
            InputStreamReader ir;
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
                ir = new InputStreamReader(System.in);
                br = new BufferedReader(ir);
            }

            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }

        static int fastPow(long b, long e) {
            long curr = b;
            long res = 1;

            while (e != 0) {
                if ((e & 1) != 0) {
                    res = (res * curr) % MOD;
                }
                curr = (curr * curr) % MOD;
                e >>= 1;
            }

            return (int) res;
        }

        static int gcd(int a, int b) {
            if (b > a) {
                return gcd(b, a);
            }

            if (b == 0) {
                return a;
            }

            return gcd(b, a % b);
        }

    }

