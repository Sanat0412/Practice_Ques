import java.util.Scanner;

public class juneCookoffSecond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            int c = 0;
            int i = 0;
            for (i = 0; i < n; i++) {
                if ( a[i] == 1 || a[i] == 2 || a[i] == 3 || a[i] == 4 || a[i] == 5 || a[i] == 6 || a[i] == 7) {
                    c += 1;
                    if (c == 7) {
                        break;
                    }
                }
            }
            System.out.println(i+1);
        }
    }
}
