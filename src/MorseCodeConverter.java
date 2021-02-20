
import java.util.Arrays;
import java.util.Scanner;
    /*In this program we convert Morse Code(if don't know then google it ) into string and string into Morse Code:
Input- str=sanat
mor=... .-
Output- morseCode=(... .- -. .- -)
        String=(sa)

*/
    public class MorseCodeConverter {
        public static String convertStringToMorseCode(String message){
            String code="";
            for (int i = 0; i < message.length(); i++) {
                char character=message.charAt(i);
                code += morseCode[alpha.indexOf(message.charAt(i))] +" ";
            }
            return code;
        }
        public static String morseCodeToString(String morsecode){
            String s="";
            String[] morseArray = morsecode.split(" ");
            for (int i = 0; i < morseArray.length; i++) {
                for (int j = 0; j < morseCode.length; j++) {
                    if (morseArray[i].equals(morseCode[j]))
                        s+=alpha.charAt(j);

                }
            }
            return s;

        }
        final static String[] morseCode={".-","-...","-.-.","-..",".","..-.","--.","...."
                ,"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","..."
                ,"-","..-","...-",".--","-..-","-.--","--.."};
        final static String alpha="abcdefghijklmnopqrstuvwxyz";

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str= sc.nextLine();
            String mor= sc.nextLine();
            System.out.println(convertStringToMorseCode(str));
            System.out.println(morseCodeToString(mor));
        }
    }


