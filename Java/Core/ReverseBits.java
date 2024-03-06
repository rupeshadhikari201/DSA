package Core;

public class ReverseBits {

    public static void main(String[] args) {
        long n = 6;
        /*
         * String string_n = String.format("%32s", Long.toBinaryString(n)).replace(' ',
         * '0');
         * StringBuilder sb = new StringBuilder(string_n);
         * // System.out.println(string_n);
         * // System.out.println(sb.reverse());
         * // sb = sb.reverse();
         * 
         * String sb_to_string = sb.reverse().toString();
         * System.out.println(sb_to_string);
         * long decimalValue = Integer.parseInt(sb_to_string, 2);
         * System.out.println(decimalValue);
         */

        long result = reverseBits(n);
        System.out.println(result);
    }

    public static long reverseBits(long n) {

        String binary_rep = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder(binary_rep);

        String reversed_binary_rep = sb.reverse().toString();
        long result = Long.parseLong(reversed_binary_rep, 2);
        return result;
    }
}
