package Core;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {

        /*
         * String in JAVA
         * There are two types of String in Java:
         * 1. Immutable String: By Default the Strings are immutable
         * All the string created resides in an special area of heap memory called as
         * String Constant Pool
         * 2. Mutable String
         * There are two classes to crete a Mutable Strings. They are:
         * i. String Buffer
         * ii. String Builder
         */

        String nameOne = new String("Rupesh");
        String nameTwo = "Prins";
        String nameThree = "Prins";

        System.out.println(nameOne == nameTwo);
        System.out.println(nameThree == nameTwo);
        System.out.println(nameOne.hashCode());
        System.out.println(nameOne.charAt(0));
        System.out.println(nameOne.toUpperCase());
        System.out.println(nameOne.toCharArray());

        /* String Buffer */
        System.out.println();
        System.out.println("String Buffer: ");
        StringBuffer sb = new StringBuffer("Rupesh");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);

        System.out.println(sb.append(" Yadav"));
        System.out.println(sb.substring(7));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.delete(7, 12));
        System.out.println(sb.getClass());

        String s = "rupeshrupesh";
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            arr[index] += 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(0 % 2);
        System.out.println('b' + 0);

    }
}
