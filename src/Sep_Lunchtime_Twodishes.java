import java.util.Scanner;

public class Sep_Lunchtime_Twodishes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if((a+c)>=n && b>=n){

                    System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }
        }
    }
}
