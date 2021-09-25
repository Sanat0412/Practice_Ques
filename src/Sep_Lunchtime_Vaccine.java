import java.util.Scanner;

public class Sep_Lunchtime_Vaccine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int d=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if (d>=l && d<=r){
                System.out.println("Take second dose now");
            } else if(d>r){
                System.out.println("Too Late");
            } else if (d<l){
                System.out.println("Too Early");
            }
        }
    }
}
