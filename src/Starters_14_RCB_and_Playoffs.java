import java.util.Scanner;

public class Starters_14_RCB_and_Playoffs {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x+(z*2)>=y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        // your code goes here
    }
}
