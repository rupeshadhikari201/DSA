package Core;

public class PalindromString {

    public static void main(String[] args) {

        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {

        // convert to lower
        String ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(ss);

        // System.out.print(sb.reverse().toString());
        // System.out.println();
        // System.out.print(ss);
        // System.out.println();
        String one = sb.reverse().toString();
        // String two = ss;
        if (one.equals(ss)) {
            return true;
        } else {
            return false;
        }
    }
}
