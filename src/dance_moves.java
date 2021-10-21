import java.util.Scanner;

public class dance_moves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=Math.abs(x-y);
           if(k==0){
               System.out.println();
           }
           else if(y>x){
               if(k%2==0){
                   System.out.println(k/2);
               }
               else{
                   System.out.println(k/2+2);
               }
           }
           else{
               System.out.println(k);
           }
        }
    }
}
