import java.util.Scanner;

public class Average_Flex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]= sc.nextInt();
            }
            int res=arr[0];
            for (int i = 1; i < n; i++) {
                res=Math.min(arr[i],res);
            }
            int count=0;
            int co=0;
            for (int i = 1; i < n; i++) {
                if(res==arr[i]){
                    count++;
                }
                else{
                    co++;
                }
            }
            if(count==n && count>co){
                System.out.println(count);
            }
            else{
                System.out.println(co);
            }

         }
    }
}
