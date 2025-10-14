/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 15-10-2025
 *   Time: 01:15
 *   File: Compute_Decimal_Representation.java
 */

import java.util.ArrayList;

public class Compute_Decimal_Representation {
   static public int[] decimalRepresentation(int n) {
        String str=String.valueOf(n);
        int l=str.length();
        System.out.println(l+" "+str);
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int j=str.charAt(i)-'0';
            if(j==0) {
                l--;
                continue;
            }
            int v=j*(int)Math.pow(10,--l);
            //System.out.println(v);
            arr.add(v);
        }
        int[] brr=arr.stream().mapToInt(Integer::intValue).toArray();
        return brr;
    }

    public static void main(String[] args) {
        int[] arr= decimalRepresentation(732);
    }
}

