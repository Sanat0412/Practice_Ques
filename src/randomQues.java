import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Mt {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int da= sc.nextInt();
        int db= sc.nextInt();
        if (da == 9 && db == 1) {
            System.out.print(99 + " " + 100);
        } else if (da == db) {
            System.out.print((da * 10 + 1) + " " + (db * 10 + 2));
        } else if (da + 1 == db) {
            System.out.print((da * 10 + 9) + " " + (db * 10));
        } else {
            System.out.print(-1);
        }
            }
    }
