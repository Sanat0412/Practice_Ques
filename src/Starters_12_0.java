import java.util.Scanner;

public class Starters_12_0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a3=sc.nextInt();
            int a4=sc.nextInt();
            int a5=sc.nextInt();
            int a6=sc.nextInt();
            int a7=sc.nextInt();
            int rainy=0;
            int sunny=0;
            if(a1==1){
            sunny++;
            } else{rainy++; }   if (a2==1){ sunny++; } else{ rainy++; } if(a3==1){sunny++; }
            else{ rainy++; }
            if(a4==1)
            { sunny++; }
            else{ rainy++; }
            if(a5==1){ sunny++; } else{ rainy++;} if(a6==1){ sunny++;}
            else { rainy++; } if (a7==1){ sunny++;} else{ rainy++;}

            if(sunny>rainy){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }



        }
    }
}
