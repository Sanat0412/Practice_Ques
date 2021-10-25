import java.util.Scanner;

public class Chef_and_Pairing_Slippers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int mrp=sc.nextInt();
            int ans=n-l;
            if(ans>l){
                System.out.println(l*mrp);
            } else{
            int res=ans*mrp;
            System.out.println(res);  }
        }
    }
}
