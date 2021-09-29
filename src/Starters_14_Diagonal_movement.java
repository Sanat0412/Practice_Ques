import java.util.Scanner;

public class Starters_14_Diagonal_movement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x= sc.nextInt();
            int y=sc.nextInt();
            x=Math.abs(x);
            y=Math.abs(y);
            if ((x%2==0 && y%2==0) || (x%2==1 && y%2==1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
