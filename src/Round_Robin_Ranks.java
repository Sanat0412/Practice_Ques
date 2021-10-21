import java.util.Scanner;

public class Round_Robin_Ranks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int a=(k-1)/2;
            System.out.println((n-k+a)*2);
        }
    }
}
