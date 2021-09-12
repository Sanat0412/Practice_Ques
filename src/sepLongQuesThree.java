import java.util.Scanner;

public class sepLongQuesThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            int evens = 0;
            int odds = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    evens++;
                } else {
                    odds++;
                }
            }
            System.out.println((int) (Math.min(Math.ceil(n / 2.0), evens) + Math.min(Math.floor(n / 2.0), odds)));
        }
    }
}
