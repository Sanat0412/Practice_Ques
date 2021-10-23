import java.util.Arrays;
import java.util.Scanner;

public class equal_beauty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr);
            if(n==2){
                System.out.println(0);;
                continue;
            }
            else if(n==3){
                System.out.println(Math.min(arr[1]-arr[0],arr[2]-arr[1]));
                continue;
            }

            long ans1=0;
            long ans2=0;
            for(int i=0;i<n-1;i++){
                ans1+=Math.abs(arr[i]-arr[(n-1)/2]);
            }
            for(int i=1;i<n;i++){
                ans2+=Math.abs(arr[i]-arr[1+(n-1)/2]);
            }
            long m=0;
            m= Math.min(ans1, ans2);
            int l=1;
            int r= n-2;
            long d1=0;
            long d2=0;

            while(l<r){
                d2= arr[n-1]-arr[l];
                d1= arr[r]-arr[0];
                m=Math.min(m, Math.abs(d1-d2));
                if(d1<d2){
                    l++;
                }
                else{
                    r--;
                }
            }
            System.out.println(m);;

        }
    }
}
