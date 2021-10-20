import java.util.Scanner;

public class Professor_And_Directions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            sc.nextLine();
            String s= sc.nextLine();
             boolean flag=true;
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i)==s.charAt(i+1)){
                    System.out.println("YES");
                    flag=false;
                    break;
                }


            }
            if(flag){
                System.out.println("NO");
            }
        }
    }
}
