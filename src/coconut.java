import java.io.*;
import java.util.*;
import java.lang.*;
class codechef{

    public static void main(String[] args) throws java.lang.Exception {

        try{

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] input = new String[4];
            int a, b, c, d;
            input = in.readLine().split(" ");
            a= Integer.parseInt(input[0]);
            b= Integer.parseInt(input[1]);
            c = Integer.parseInt(input[2]);
            d = Integer.parseInt(input[3]);
            int cocos = (c/a)+(d/b);
            System.out.println(cocos);
        }
        catch(Exception e){}
    }
}