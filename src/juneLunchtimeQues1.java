
import java.util.Scanner;

public class juneLunchtimeQues1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t= sc.nextInt();
    sc.nextLine();
    while(t-->0){
        String s=sc.next();
        if (s.charAt(0)=='1') {
            String newString = String.valueOf(s.charAt(0)) + '0';

            newString += s.substring(1);
            System.out.println(newString);
        }
        else{
            String newString =String.valueOf('1');
            newString+=s.substring(0);
            System.out.println(newString);
        }
    }
}
}