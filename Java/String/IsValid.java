package Java.String;

public class IsValid {

    public static void main(String[] args) {

        String s1 = "1100";
        String s2 = "1010";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));

    }

    public static boolean isValid(String s) {

        boolean valid = false;
        for (int i = 0; i < s.length(); i++) {

            if (i != 0 && s.charAt((i - 1)) == s.charAt(i)) {
                valid = true;
            }

        }
        return valid;

    }

}
