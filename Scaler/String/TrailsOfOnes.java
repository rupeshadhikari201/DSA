package Scaler.String;

public class TrailsOfOnes {

    static int ans = 0;
    static int mod = 1_000_000_007;

    public static void main(String[] args) {

        int n = 3;
        String s = "";
        int index = 0;

        countConsecutiveOnes(n, s, index);
        System.out.println(ans);
    }

    public static void countConsecutiveOnes(int n, String s, int index) {
        // base case
        if (index == n) {
            if (isValid2(s)) {
                ans = (ans + 1) % mod;
            }
            return;
        }

        countConsecutiveOnes(n, s + "0", index + 1);
        countConsecutiveOnes(n, s + "1", index + 1);

    }

    public static boolean isValid1(String s) {
        boolean valid = false;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0 && s.charAt((i - 1)) == s.charAt(i)) {
                valid = true;
            }
        }
        return valid;
    }

    public static boolean isValid2(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == '1' && s.charAt(i) == '1') {
                return true;
            }
        }
        return false;
    }

}
