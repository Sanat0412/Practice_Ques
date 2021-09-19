import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.*;

public class Sept_Cookoff_ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            int e = 0;
            int o = 0;
            Queue<Integer> evens = new PriorityQueue<>();
            Queue<Integer> odds = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    evens.offer(arr[i]);
                    e++;

                } else {
                    odds.offer(arr[i]);
                    o++;
                }
            }

            if (e < 0 || o < 0) {
                System.out.println(-1);
            }
            else{
                while (odds.size()>0){
                    System.out.print(odds.poll()+" ");
                }
                while (evens.size()>0){
                    System.out.print(evens.poll()+" ");
                }
                System.out.println();
            }

        }
    }
}
