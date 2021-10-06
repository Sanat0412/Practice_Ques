import java.util.*;
class Say_no_to_drugs
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int l=sc.nextInt();
           Integer[] arr=new Integer[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int a=arr[n-1];
            int b = Collections.max(Arrays.asList(arr));
            if(a==b){
                System.out.println("Yes");
            }
            else if((a+(l-1)*k)>b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
                 }
        // your code goes here
    }
}
