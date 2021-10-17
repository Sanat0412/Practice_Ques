import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int even=0;
        int odd=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd++;
            }
        }
        if(even>odd){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
    }
}
