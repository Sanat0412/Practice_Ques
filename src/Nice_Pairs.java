import java.util.Scanner;

public class Nice_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            char[] arr=sc.nextLine().toCharArray();
            int count=0;
            for (int i = 0; i < n; i++) {
                int a=Integer.parseInt(arr[i]+"");
                for (int j = i+1; j < i+10 && j<n; j++) {
                    int b=Integer.parseInt(arr[j]+"");
                    if(Math.abs(a-b)==j-i){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
