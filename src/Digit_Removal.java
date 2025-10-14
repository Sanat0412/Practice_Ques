import java.util.Scanner;

public class Digit_Removal {
    public static int helper(int n, int d) {
        int i = 0;
        int res = -1;
        while (n > 0) {
            if (n % 10 == d) {
                res = i;
            }
            i++;
            n /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            long newN = a;
            int c = 0;
            long res = 0;
            while (newN > 0) {
                long temp = newN % 10;
                newN = newN / 10;
                c++;
                if (temp == b) {
                    newN = (long) (newN * Math.pow(10, c) + (b + 1) * Math.pow(10, c - 1));
                    res = newN - a;
                    c = 0;
                }
            }
            System.out.println(res);
        }
    }
}
