import java.util.Arrays;
import java.util.Scanner;

public class chef_and_magical_step {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        boolean[] sieve = sieve();
        while (tc-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0;
            int temp = 0;
            if (x <= 2) temp += 1;
            for (int i = x + 1; i <= y; i++) {
                if (sieve[i]) {
                    count++;
                }
            }
            System.out.println(y - x - count + temp);
        }
        sc.close();
    }

    static boolean[] sieve() {
        boolean[] sieve = new boolean[10000001];
        Arrays.fill(sieve, true);
        for (int i = 2; i*i <= 10000000; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= 10000000; j += i) {
                    sieve[j] = false;
                }
            }
        }
        return sieve;
    }
}


